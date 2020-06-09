/**
 * 引用数据类型 Scanner
 */

import java.util.Scanner;

public class ScannerDemo {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int age = scan.nextInt();
    System.out.println(age);
  }
}