import java.util.Random;

public class RandomDemo {
  public static void main(String args[]) {
    Random r = new Random();
    int i = r.nextInt(100); // 0-99
    double d = r.nextDouble();
    System.out.println(i);
    System.out.println(d);
  }
}