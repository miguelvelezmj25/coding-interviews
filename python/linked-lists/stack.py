class Stack:
    """
        Implement a Stack using a Linked List
    """

    def __init__(self):
        self.head = None

    def push(self, element):
        """
            Add an element to the top of the stack
        """

        # Create a new node with the element passed that points to the head
        node = Node(element, self.head)

        # The new head of the list is the new node
        self.head = node

    def pop(self):
        """
            Remove and return the top of the stack
        """

        # Check if there is an element in the stack
        if self.head is None:
            raise Exception("The stack is current empty")

        # Get the current head
        head = self.head

        # Set the head to the next node of the current head
        self.head = head.nextNode

        # Return the former head
        return head.data


class Node:
    """
        Helper class that represents a node
    """

    def __init__(self, data, next_node):
        self.data = data
        self.nextNode = next_node


if __name__ == '__main__':
    stack = Stack()

    # stack.pop()
    stack.push(5)
    stack.push('Miguel')

    print stack.pop()
    print stack.pop()
