package streams_new;

import java.util.*;

/**
 * Difference between Arrays.asList() and List.of()
 * 
 * Key Differences:
 * 1. List.of() - Immutable (Java 9+)
 * 2. Arrays.asList() - Fixed-size but mutable
 * 3. Null handling - List.of() throws NPE, Arrays.asList() allows null
 * 4. Performance - List.of() is optimized, Arrays.asList() is lightweight wrapper
 */
public class ArraysAsListVsListOf {
    public static void main(String[] args) {
        
        System.out.println("=== DIFFERENCE BETWEEN Arrays.asList() AND List.of() ===\n");
        
        // 1. MUTABILITY (Modifying existing elements)
        System.out.println("1. MUTABILITY - Can you modify elements?");
        System.out.println("-------------------------------------------");
        
        // Arrays.asList() - Elements CAN be modified
        List<String> list1 = Arrays.asList("apple", "banana", "cherry");
        System.out.println("Arrays.asList() before: " + list1);
        list1.set(0, "orange");  // This works!
        System.out.println("Arrays.asList() after set(0, 'orange'): " + list1);
        
        // List.of() - Elements CANNOT be modified
        List<String> list2 = List.of("apple", "banana", "cherry");
        System.out.println("\nList.of() before: " + list2);
        try {
            list2.set(0, "orange");  // This throws UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("List.of() - Cannot modify: " + e.getClass().getSimpleName());
        }
        
        
        // 2. ADDING/REMOVING ELEMENTS
        System.out.println("\n\n2. ADDING/REMOVING - Can you add or remove elements?");
        System.out.println("-------------------------------------------");
        
        // Arrays.asList() - Fixed size, cannot add/remove
        List<String> list3 = Arrays.asList("apple", "banana", "cherry");
        System.out.println("Arrays.asList() before: " + list3);
        try {
            list3.add("date");  // This throws UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("Arrays.asList() - Cannot add new elements: " + e.getClass().getSimpleName());
        }
        
        // List.of() - Immutable, cannot add/remove
        List<String> list4 = List.of("apple", "banana", "cherry");
        System.out.println("\nList.of() before: " + list4);
        try {
            list4.add("date");  // This throws UnsupportedOperationException
        } catch (UnsupportedOperationException e) {
            System.out.println("List.of() - Cannot add new elements: " + e.getClass().getSimpleName());
        }
        
        
        // 3. NULL ELEMENTS
        System.out.println("\n\n3. NULL HANDLING - Can you have null elements?");
        System.out.println("-------------------------------------------");
        
        // Arrays.asList() - ALLOWS null
        List<String> list5 = Arrays.asList("apple", null, "cherry");
        System.out.println("Arrays.asList() with null: " + list5);  // Works fine
        
        // List.of() - DOES NOT ALLOW null
        try {
            List<String> list6 = List.of("apple", null, "cherry");
        } catch (NullPointerException e) {
            System.out.println("List.of() with null throws: " + e.getClass().getSimpleName());
        }
        
        
        // 4. BACKING ARRAY
        System.out.println("\n\n4. BACKING ARRAY - Is it backed by the original array?");
        System.out.println("-------------------------------------------");
        
        // Arrays.asList() - Backed by original array (any change to original affects list)
        String[] arr1 = {"apple", "banana", "cherry"};
        List<String> list7 = Arrays.asList(arr1);
        System.out.println("Arrays.asList() - Original list: " + list7);
        arr1[0] = "orange";  // Modify original array
        System.out.println("Arrays.asList() - After modifying original array: " + list7);
        System.out.println("Note: The list reflects changes to the original array!");
        
        // List.of() - NOT backed by original array (independent)
        String[] arr2 = {"apple", "banana", "cherry"};
        List<String> list8 = List.of(arr2);
        System.out.println("\nList.of() - Original list: " + list8);
        arr2[0] = "orange";  // Modify original array
        System.out.println("List.of() - After modifying original array: " + list8);
        System.out.println("Note: The list is independent of the array!");
        
        
        // 5. JAVA VERSION
        System.out.println("\n\n5. JAVA VERSION AVAILABILITY");
        System.out.println("-------------------------------------------");
        System.out.println("Arrays.asList() - Available since Java 1.2");
        System.out.println("List.of() - Available since Java 9+");
        
        
        // 6. PERFORMANCE
        System.out.println("\n\n6. PERFORMANCE");
        System.out.println("-------------------------------------------");
        System.out.println("Arrays.asList() - Lightweight wrapper, fast instantiation");
        System.out.println("List.of() - Optimized for immutability, better memory usage");
        
        
        // 7. WHEN TO USE?
        System.out.println("\n\n7. WHEN TO USE EACH?");
        System.out.println("-------------------------------------------");
        System.out.println("Arrays.asList():");
        System.out.println("  - When you need to modify individual elements");
        System.out.println("  - When you need Java 1.2+ compatibility");
        System.out.println("  - When you might have null values");
        System.out.println("  - When converting array to List for stream processing");
        
        System.out.println("\nList.of():");
        System.out.println("  - When you want immutable lists (safer)");
        System.out.println("  - When you're using Java 9 or later");
        System.out.println("  - When you need guaranteed thread-safety");
        System.out.println("  - When you don't need null values");
        
        
        // 8. PRACTICAL EXAMPLE
        System.out.println("\n\n8. PRACTICAL EXAMPLE - Which one to use?");
        System.out.println("-------------------------------------------");
        
        // Use Case 1: Converting array for streaming (Arrays.asList is fine)
        int[] numbers = {1, 2, 3, 4, 5};
        List<Integer> numList1 = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("For stream processing: Arrays.asList() works well");
        
        // Use Case 2: Creating immutable constant list (List.of is better)
        List<String> VALID_STATUSES = List.of("ACTIVE", "INACTIVE", "PENDING");
        System.out.println("For constant immutable lists: List.of() is better: " + VALID_STATUSES);
        
        // Use Case 3: Need to modify list (create mutable list first)
        List<String> mutableList = new ArrayList<>(Arrays.asList("apple", "banana"));
        mutableList.add("cherry");
        System.out.println("For mutable list: Wrap Arrays.asList() in ArrayList: " + mutableList);
    }
}

