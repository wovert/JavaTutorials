public class DemoStringBuffer {
  public static void main(String[] args) {
    StringBuffer buffer = new StringBuffer();
    buffer.append("helllo").append(100).append(false);
    System.out.println(buffer.toString());

    String s = "abc";
    int i = 100;
    boolean b = true;
    String str = s + i + b;
    System.out.println(str);
  }
}