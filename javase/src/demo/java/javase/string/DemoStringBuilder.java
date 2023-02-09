package demo.java.javase.string;

public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("abc").append("def").append("xyz");
        String s = sb.toString();
        System.out.println("s=" + s);
    }
}
