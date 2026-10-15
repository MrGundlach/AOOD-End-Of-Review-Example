import java.util.ArrayList;

public class ArrayLab {
  public static void main(String[] args) {
    System.out.println("=== PART 1: Working with Fixed-Size Arrays ===");

    // Declare and initialize a fixed-size String array of size 3
    String[] fixedArray = new String[3];
    fixedArray[0] = "Alpha";
    fixedArray[1] = "Beta";
    fixedArray[2] = "Gamma";

    // Print array elements using a standard loop
    System.out.println("Fixed Array Contents:");
    for (int i = 0; i < fixedArray.length; i++) {
      System.out.println("Index " + i + ": " + fixedArray[i]);
    }
    // This will throw an ArrayIndexOutOfBoundsException
    // fixedArray[3] = "Delta"; 

    System.out.println("\n=== PART 2: Working with Dynamic Arrays (ArrayList) ===");
    ArrayList<String> dynamicArray = new ArrayList<>();
    dynamicArray.add("Alpha");
    dynamicArray.add("Beta");
    dynamicArray.add("Gamma");

    // Print array elements using a standard loop
    System.out.println("Dynamic Array Contents:");
    for (int i = 0; i < dynamicArray.size(); i++) {
      System.out.println("Index " + i + ": " + dynamicArray.get(i));
    }

    // Add a new element to the dynamic array
    dynamicArray.add("Delta");
    // Print the updated array contents with an enhanced for loop
    System.out.println("\nAfter adding 'Delta':");
    for (String element : dynamicArray) {
      System.out.println(element);
    }

    // Remove an element from the dynamic array
    dynamicArray.remove("Beta");
    // Print the updated array contents after removal
    System.out.println("\nAfter removing 'Beta':");
    for (String element : dynamicArray) {
      System.out.println(element);
    } 

    // Attempt to access an index that doesn't exist
    try {
      System.out.println("\nAttempting to access index 5:");
      System.out.println(dynamicArray.get(5));
    } catch (IndexOutOfBoundsException e) {
      System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
    } 
  }
  
}
