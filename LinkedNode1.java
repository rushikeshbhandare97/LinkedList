


    // A Linked List Node
    class Node
    {
        int data;
        Node next;

        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
        }

        public Node() {

        }
    }

    class Main
    {
        // Helper function to print a given linked list
        public static void printList(Node head)
        {
            Node ptr = head;
            while (ptr != null)
            {
                System.out.print(ptr.data + " —> ");
                ptr = ptr.next;
            }

            System.out.println("null");
        }

        // The opposite of `push()`. Takes a non-empty list, removes the front
        // node, and prints the data in that node.
        public static Node pop(Node headRef)
        {
            // underflow condition
            if (headRef == null) {
                return null;
            }

            int result = headRef.data;  // pull out data before the node is deleted
            headRef = headRef.next; 	// unlink the head node for the caller

            System.out.println("The Popped node is " + result);

            return headRef;
        }

        public static void main(String[] args)
        {
            // input keys
            int[] keys = {56,30,70};

            // points to the head node of the linked list
            Node head = null;

            // construct a linked list
            for (int i = keys.length - 1; i >= 0; i--) {
                head = new Node(keys[i], head);
            }

            head = pop(head);

            // print remaining linked list
            printList(head);
        }
    }

