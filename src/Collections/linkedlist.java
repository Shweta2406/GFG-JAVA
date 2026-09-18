package Collections;
import java.util.*;
public class linkedlist {
    public static void main(String[] args)
    {
        // Creating a LinkedList that implements List interface
        List<Integer> l1 = new LinkedList<>();
        
        // 1. ADD - Adding elements at the end
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l1.add(40);
        System.out.println("After adding elements: " + l1);
        
        // 2. ADD at specific index
        l1.add(2, 25); // Adding 25 at index 2
        System.out.println("After adding 25 at index 2: " + l1);
        
        // 3. GET - Retrieve element at specific index
        System.out.println("Element at index 1: " + l1.get(1));
        System.out.println("Element at index 3: " + l1.get(3));
        
        // 4. SIZE - Get the size of LinkedList
        System.out.println("Size of LinkedList: " + l1.size());
        
        // 5. CONTAINS - Check if element exists
        System.out.println("Contains 25? " + l1.contains(25));
        System.out.println("Contains 100? " + l1.contains(100));
        
        // 6. REMOVE by index
        int removed = l1.remove(2); // Removes element at index 2
        System.out.println("After removing element at index 2: " + l1);
        System.out.println("Removed element: " + removed);
        
        // 7. REMOVE by object
        l1.remove(Integer.valueOf(40)); // Removes first occurrence of 40
        System.out.println("After removing 40: " + l1);
        
        // 8. ISEMPTY - Check if LinkedList is empty
        System.out.println("Is LinkedList empty? " + l1.isEmpty());
        
        // 9. INDEX OF - Find index of first occurrence
        System.out.println("Index of 20: " + l1.indexOf(20));
        System.out.println("Index of 10: " + l1.indexOf(10));
        
        // 10. LAST INDEX OF - Find index of last occurrence
        l1.add(20); // Adding duplicate 20
        System.out.println("After adding duplicate 20: " + l1);
        System.out.println("Last Index of 20: " + l1.lastIndexOf(20));
        
        // 11. GET ALL elements using Iterator
        System.out.println("\nIterating through LinkedList using Iterator:");
        Iterator<Integer> iterator = l1.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        
        // 12. LinkedList specific methods (addFirst, addLast, etc.)
        LinkedList<Integer> ll = (LinkedList<Integer>) l1;
        ll.addFirst(5);
        System.out.println("\nAfter addFirst(5): " + ll);
        
        ll.addLast(50);
        System.out.println("After addLast(50): " + ll);
        
        System.out.println("getFirst(): " + ll.getFirst());
        System.out.println("getLast(): " + ll.getLast());
        
        // 13. REMOVEIRST and REMOVELAST
        int first = ll.removeFirst();
        System.out.println("After removeFirst(), removed: " + first + ", List: " + ll);
        
        int last = ll.removeLast();
        System.out.println("After removeLast(), removed: " + last + ", List: " + ll);
        
        // 14. SET - Replace element at index
        Integer oldValue = l1.set(0, 100);
        System.out.println("\nAfter setting index 0 to 100, old value: " + oldValue);
        System.out.println("LinkedList after set: " + l1);
        
        // 15. CLEAR - Remove all elements
        LinkedList<Integer> tempList = new LinkedList<>(l1);
        tempList.clear();
        System.out.println("After clear: " + tempList);
        System.out.println("Is empty after clear? " + tempList.isEmpty());
    }
}
