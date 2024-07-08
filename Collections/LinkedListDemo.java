import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();

        colors.add("red");
        colors.add("blue");
        colors.add("green");

        colors.add(1, "yellow");

        colors.addFirst("pink");
        colors.addLast("white");

        System.out.println(colors);

        colors.remove();
        
        System.out.println(colors);

        colors.removeFirst();

        System.out.println(colors);

        colors.removeLast();

        System.out.println(colors);

        colors.remove(1);

        System.out.println(colors);
    }
}
