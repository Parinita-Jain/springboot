public class App {
    public static void main(String[] args) throws Exception {
        int a = 9;
        int b = 0;
        System.out.println("Before Exception");
        //JVM will identify the ArithmeticException
        //and since the programmer is not handling 
        //this exception, JVM will handle it by
        //stopping the execution of the program at this
        //statement and no further statement will be 
        //executed
        System.out.println(a/b);
        System.out.println("After Exception");
    }
}
