public class TryMultipleCatchDemo {
    public static void main(String[] args) {
        System.out.println("Before Exception");
        try{
            int a = 10;
            int b = 10;
            System.out.println(a/b);

            int[] nums = {3,5,6,8,9};
            System.out.println(nums[4]);

            String str = "hello";
            System.out.println(str.toUpperCase());

            String message = "good morning";
            System.out.println(message.charAt(2));

            String num = "12a";
            System.out.println(Integer.parseInt(num));
        }        
        catch(ArithmeticException e){
            System.out.println("Handled by the programmer");
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Index is out of range");
        }
        catch(NullPointerException a){
            System.out.println(a.getMessage());
        }
        //global catch block
        //should come as last block
        catch(Exception e){
            System.out.println("Common Catch Block");
            System.out.println(e.getMessage());
        }
        
        System.out.println("After Exception");
    }
}
