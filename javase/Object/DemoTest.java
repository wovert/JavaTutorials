public class DemoTest {
  public static void main(String[] args) {
    Object object = new Object();
    
    System.out.println(object); // 默认调用 toString()
    System.out.println(object.toString());

    String str = "hello";

    System.out.println(str);
    System.out.println(str.toString());

    Student student = new Student();
    System.out.println(student);
    System.out.println(student.toString());
  }
}

class Student extends Object {
  public String toString() {
    return "Hello World";
  }
}