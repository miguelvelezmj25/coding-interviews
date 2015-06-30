"""
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
    multiples is 23.

    Find the sum of all the multiples of 3 or 5 below 1000.
"""

def sum_3_and_5_multiples(max):
    # Variable to store result
    total = 0

    # Loop through all the numbers below max
    for i in range(0, max):

        # If i is a multiple of 3 or 5
        if i % 3 == 0 or i % 5 == 0:
            # Add that number to the total
            total += i

    # Print the result
    print total

if __name__ == '__main__':
    sum_3_and_5_multiples(1000)
