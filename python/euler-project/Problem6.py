# coding=utf-8
"""
The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
"""

def main(numbers):
    # Variable for results
    sum_of_squares = 0
    sum_squared = 0
    difference = 0

    # Loop through all the numbers
    for i in range(0, numbers + 1):
        # Sum the square
        sum_of_squares += i**2

        # Sum the number
        sum_squared += i

    # Square the regular sum
    sum_squared = sum_squared * sum_squared

    # Calculate the difference
    difference = sum_squared - sum_of_squares

    print difference

if __name__ == '__main__':
    main(100)