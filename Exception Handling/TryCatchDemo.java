public class TryCatchDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        System.out.println("Before Exception");
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println("Handled by the programmer");
            System.out.println(e.getMessage());
        }
        System.out.println("After Exception");
    }
}
