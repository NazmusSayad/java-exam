import java.util.ArrayList;

public class List {
  public static void main(String[] args) {
    // Tuple is an array with a fixed size
    int[] tuple = new int[5];
    for (int i : tuple) {
      System.out.println(i);
    }

    // Array is a list with a dynamic size
    ArrayList<String> array = new ArrayList<String>();

    array.add("Hello 1");
    array.add("Hello 2");
    array.add("Hello 3");
    array.remove(0);
    array.addFirst("Hello 0");

    System.out.println(array.toString());
  }
}
