import java.util.ArrayList;

public class ArrayListDemo {
  public static void main(String[] args) {
    ArrayList<Integer> arr = new ArrayList<Integer>();
    arr.add(11);
    arr.add(12);
    arr.add(13);
    arr.add(14);
    arr.add(15);
    arr.add(16);
    arr.add(17);
    arr.add(17);

    for(int i=0; i<arr.size(); i++) {
      System.out.println(arr.get(i));
    }
  }
}