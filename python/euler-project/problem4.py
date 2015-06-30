"""
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
 is 9009 = 91 * 99.

Find the largest palindrome made from the product of two 3-digit numbers.
"""

def main():
    # List of all palindromes
    palindromes = []

    x = 1
    y = 1

    # While x is less than 1000
    while x < 1000:

        # While x is less than 1000
        while y < 1000:

            # Multiply the two numbers
            product = x * y

            # If it is a palindrome
            if is_palindrome(product):
                # Add to the list
                palindromes.append(product)

            # Update y
            y += 1

        # Update numbers
        x += 1
        y = 1

    # Return the maximum palindrome
    return max(palindromes)


def is_palindrome(number):
    # Convert number to string
    string = str(number)

    # Find the middle point
    middle = len(string)/2

    # Loop through half of the string
    for i in range(0, middle):
        # If the characters are not the same
        if string[i] != string[len(string) - 1 - i]:
            # Not a palindrome
            return False

    # It is a palindrome
    return True

if __name__ == '__main__':
    print main()
