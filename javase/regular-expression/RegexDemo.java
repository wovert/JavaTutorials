public class RegexDemo {
  public static void main(String[] args) {
    String ip = "192.168.1.2";
    String[] strArr = ip.split("\\.");
    System.out.println("Array length" + strArr.length);
    for (int i=0; i<strArr.length; i++) {
      System.out.println(strArr[i]);
    }
  }
}