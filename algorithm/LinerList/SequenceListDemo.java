public class SequenceListDemo {
    public static void main(String[] args) {
        SequenceList l = new SequenceList();
        l.add("Apple");
        l.add("Banana");

        System.out.println(l.get(1));
        System.out.println(l.get(0));
        System.out.println(l.size());

        l.set(0,"two");
        System.out.println(l.size());
    }
}