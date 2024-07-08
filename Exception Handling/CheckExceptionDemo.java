import java.io.FileReader;

public class CheckExceptionDemo {
    public static void main(String[] args) {
        int a = 9;
        int b = 0;
        System.out.println("Before Exception");
        System.out.println(a/b); //unchecked exception
        System.out.println("After Exception");

        //checked exception, handle it
        FileReader reader = null;
        try{
            reader = 
                new FileReader("d://demo.txt");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        finally{
            try{
                reader.close();
            }
            catch(Exception e){}
        }
    }
}
