// Java implementation to insert node
// at the middle of the linked list
import java.util.*;
import java.lang.*;
import java.io.*;

class LinkedList
{
	static Node head; // head of list

	/* Node Class */
	static class Node {
		int data;
		Node next;
		
		// Constructor to create a new node
		Node(int d) {
			data = d;
			next = null;
		}
	}

	// function to insert node at the
	// middle of the linked list
	static void insertAtMid(int x)
	{
		// if list is empty
		if (head == null)
			head = new Node(x);
		else {
			// get a new node
			Node newNode = new Node(x);

			Node ptr = head;
			int len = 0;

			// calculate length of the linked list
			//, i.e, the number of nodes
			while (ptr != null) {
				len++;
				ptr = ptr.next;
			}

			// 'count' the number of nodes after which
			// the new node is to be inserted
			int count = ((len % 2) == 0) ? (len / 2) :
										(len + 1) / 2;
			ptr = head;

			// 'ptr' points to the node after which
			// the new node is to be inserted
			while (count-- > 1)
				ptr = ptr.next;

			// insert the 'newNode' and adjust
			// the required links
			newNode.next = ptr.next;
			ptr.next = newNode;
		}
	}

	// function to display the linked list
	static void display()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	// Driver program to test above
	public static void main (String[] args)
	{
		// Creating the list 56,30,70
		head = null;
		head = new Node(56);
		head.next = new Node(70);
		
		
		
		System.out.println("Linked list before "+
						"insertion: ");
		display();

		int x = 30;
		insertAtMid(x);

		System.out.println("\nLinked list after"+
						" insertion: ");
		display();
	}
}

// This article is contributed by Chhavi
