import java.util.Date;

public class DateDemo {
  public static void main(String[] args) {
    // Date类型，单位：毫秒
    // 获取当前系统中的时间和对象
    Date d = new Date();

    // Sun Aug 08 10:18:26 CST 2088
    // CST: China Standard Time
    System.out.println(d);

    // 当前日期的毫秒值
    // 时间原点：公元1970-01-01 午夜00:00:00
    long t = System.currentTimeMillis();


    System.out.println(t);


    // 0 表示毫秒值，讲毫秒值转成对应的日期对象
    Date d2 = new Date(0);

    // Thu Jan 0 08:00:00 CST 1970
    System.out.println(d2);

  }
}