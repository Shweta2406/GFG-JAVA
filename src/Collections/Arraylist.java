package Collections;
import java.util.*;

/**
 * This class demonstrates basic operations on ArrayList in Java,
 * including adding, removing, setting elements, and iterating through the list.
 */
public class Arraylist {
    public static void main(String[] args) {
        // Create a new ArrayList to store integers
        List<Integer> arr = new ArrayList<>();
        
        // Add elements to the list
        arr.add(10);
        arr.add(30);
        arr.add(1, 20);  // Insert 20 at index 1
        
        // Print the initial list
        System.out.println(arr);
        
        // Create another list with initial elements 40 and 50
        List<Integer> arr2 = new ArrayList<>(Arrays.asList(40, 50));
        
        // Add all elements from arr2 to arr
        arr.addAll(arr2);
        
        // Print all elements in arr using enhanced for loop
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();  // New line for better output formatting
        
        // Remove the element at index 1
        arr.remove(1);
        System.out.println(arr);
        
        // Remove the element with value 20 (if present)
        arr.remove(Integer.valueOf(20));
        System.out.println(arr);
        
        // Get the element at index 3 (though not used here, just demonstrating)
        arr.get(3);
        
        // Set the element at index 3 to 35
        arr.set(3, 35);
        
        // Print all elements using traditional for loop
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();  // New line
        
        // Iterate through the list using an Iterator
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();  // New line
    }
}
