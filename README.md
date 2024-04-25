Implementation of Singly Linked List in Java for Integer Values

Description:
This Java implementation provides a singly linked list data structure tailored for integer values. The implementation consists of two classes: `LinkedList` and `Node`. 

The `Node` class encapsulates the individual elements of the linked list. Each node contains two fields: `val`, which holds the integer value, and `next`, a reference to the next node in the list. Two constructors are provided for flexibility in node creation.

The `LinkedList` class serves as the container for the linked list. It maintains three fields: `size`, indicating the number of elements in the list, `head`, a reference to the first node, and `tail`, a reference to the last node. The constructor which initializes size to the 0 when we create new LinkedList.

Several methods are implemented to perform operations on the linked list:

1. `addFirst(int value)`: Inserts a new node with the specified integer value at the beginning of the list.
2. `addLast(int value)`: Inserts a new node with the specified integer value at the end of the list.
3. `display()`: Traverses the list and prints the integer values of all nodes.
4. `removeFirst()`: Removes the first node from the list.
5. `removeLast()`: Removes the last node from the list.
6. `set(int index, int value)`: Sets the value of the node at the specified index to the given integer value.
7. `remove(int index)`: Removes the first occurrence of the node at the specified index from the list.
8. `get(int index)`: Retrieves the integer value of the node at the specified index in the list.
9. `peek()`: Retrieves the integer value stored in the first node of the list without removing it.

This implementation provides a versatile and efficient way to work with singly linked lists containing integer values in Java, suitable for various applications requiring dynamic data storage and manipulation.
