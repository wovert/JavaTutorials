public class DemoInteger {
  public static void main(String[] args) {
    int a = 10;
    Integer i = new Integer(a);
    int b = i.intValue();
    System.out.println(a == b);
  }
}