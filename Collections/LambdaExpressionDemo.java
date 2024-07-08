@FunctionalInterface
interface Drawing{
    void paint(); //no-arg method
}

@FunctionalInterface
interface Greeting{
    void sendGreeting(String msg);
}

@FunctionalInterface
interface Operations{
    void addition(int a, int b);
}

@FunctionalInterface
interface Maths{
    float product(float num1, float num2);
}

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        Drawing d = () -> {
            System.out.println("Using Lambda Expression");
            System.out.println("For no-arg method implementation");
        };
        d.paint();

        Drawing d1 = () -> System.out.println("Only one statement to be implemented");
        d1.paint();

        Greeting greet = msg -> {
            System.out.println("Using Lambda Expression");
            System.out.println("For one-arg method implementation");
            System.out.println("Message send is " + msg);
        };

        greet.sendGreeting("Hello");
        greet.sendGreeting("Good Morning");

        Operations op = (a,b) -> System.out.println("Sum = " + (a+b));
        op.addition(3, 9);
        op.addition(7, 3);

        Maths ms = (x, y) -> x * y;

        System.out.println(ms.product(7.6f, 3.5f));
    }
}