import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsKeywordDemo {
    public static void fileReading() 
        throws FileNotFoundException{
        FileReader reader = new FileReader("demo.txt");
    }

    public static void findClass()
        throws ClassNotFoundException{
        Class.forName("Student");
    }
    public static void main(String[] args) {
        try{
            fileReading();
            findClass();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
