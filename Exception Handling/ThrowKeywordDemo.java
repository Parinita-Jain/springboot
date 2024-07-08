public class ThrowKeywordDemo {
    public static void main(String[] args) {
        int a = 100;
        int b = 10;
        try{
            if(b < 0)
                throw new ArithmeticException("Denominator is negative");
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
