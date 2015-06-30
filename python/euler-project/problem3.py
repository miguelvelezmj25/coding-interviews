"""
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
"""

def largest_prime_factor(number):
    # Create a list for all primes numbers
    primes = []

    # Create a list for all prime factors
    prime_factors = []

    # Loop through all the numbers
    i = 2

    while i <= number:
        # Check if the number is prime
        check_if_prime(i, primes)

        # Check if the number is a prime factor of the number
        if i in primes and number % i == 0:
            prime_factors.append(i)
            print prime_factors

        # Increment i
        i += 1

    # Print the larges prime factor
    print max(prime_factors)


def check_if_prime(number, primes):
    """
    Checks if the number is prime by looping through a list of prime numbers. If It is a prime, it is added to the list

    :param number:
    :param primes:
    :return:
    """

    # Loop through the prime numbers
    for prime in primes:

        # If the number is evenly divisible by a prime number
        if number % prime == 0:
            # It is not a prime number
            return

    # Insert the new prime number to the list
    primes.append(number)

if __name__ == '__main__':
    largest_prime_factor(600851475143)
