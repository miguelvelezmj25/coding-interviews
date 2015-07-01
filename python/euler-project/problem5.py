"""
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
"""

def main():
    x = 2*3*5*7*9*11*13*17*19

    # Do this loop until we find an answer
    while True:
        # Assume number is evenly divisible
        divisible = True

        # Loop through the numbers 11 to 20
        for i in range(11, 21):

            # If the number is not evenly divisible by a number between 11 and 20
            if x % i != 0:
                # Not divisible
                divisible = False

                # End this loop
                break

        # If divisible
        if divisible:
            # Print and return
            print x

            return
        # If not divisible
        else:
            # Increase the number
            x += 1

if __name__ == '__main__':
    main()
