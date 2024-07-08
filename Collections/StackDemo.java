import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> names = new Stack<>();
        names.add("mike");
        names.add("scott");

        names.push("king");
        names.push("jim");

        System.out.println(names);

        names.pop();

        System.out.println(names);


    }
}
