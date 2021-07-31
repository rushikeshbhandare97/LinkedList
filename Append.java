
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
    class LinkedListAddAll {

        public static void main(String[] args) {

            // create a LinkedList
            LinkedList<String> list = new LinkedList<String>();

            // Add elements to the LinkedList
            list.add("56");
            list.add("30");
            list.add("70");


            // Displaying linked list before add
            System.out.println("Before: LinkedList: " + list);

            // create a new list having few elements
            List<String> arrayList = new ArrayList<String>();
            arrayList.add("56");
            arrayList.add("30");
            arrayList.add("70");

            // Append the list elements to LinkedList
            list.addAll(arrayList);

            // Displaying the LinkedList after addAll
            System.out.println("After: LinkedList: " + list);
        }
    }

