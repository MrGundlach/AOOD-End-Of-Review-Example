import java.util.ArrayList;

public class ArrayLab {
  public static void main(String[] args) {
    System.out.println("=== PART 1: Working with Fixed-Size Arrays ===");

    //TODO 1: Declare and initialize a fixed-size String array of size 3
    String[] fixedArray = new String[3];
    fixedArray[0] = "Alpha";
    fixedArray[1] = "Beta";
    fixedArray[2] = "Gamma";

    // Print array elements using a standard loop
    System.out.println("Fixed Array Contents:");
    for (int i = 0; i < fixedArray.length; i++) {
      System.out.println("Index " + i + ": " + fixedArray[i]);
    }
  }
  
}
