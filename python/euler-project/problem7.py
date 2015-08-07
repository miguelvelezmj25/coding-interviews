"""
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?
"""

def main():
    primes = []
    i = 2

    # While there are less than 10001 prime numbers
    while len(primes) < 10001:
        # Check if prime
        check_if_prime(i, primes)

        # Increment i
        i += 1

    # Print the maximum
    print max(primes)


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
    main()
