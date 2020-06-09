public class DemoString {
  public static void main(String[] args) {
 
    String str1 = "abc";
    String str2 = "abc";

    System.out.println(str1 == str2); // true
    System.out.println("------------");

    String str3 = new String("aaa");
    String str4 = new String("aaa");

    System.out.println(str3 == str4); // false
    System.out.println("------------");


  }
}