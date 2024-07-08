import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CharacterStreamingDemo {
    public static void fileReading()
        throws FileNotFoundException, IOException{
        FileReader reader = 
            new FileReader("D:\\JavaEssentials-Weekday-10-12\\demo.txt");
    
        //we are reading one character at a time
        //so multiple reads are performed on file
        // int charRead = reader.read();
        // while(charRead != -1){
        //     System.out.println((char)charRead);
        //     charRead = reader.read();
        // }

        //we are creating an array and performing
        //file read only once
        char[] charsRead = new char[100];
        reader.read(charsRead);

        for(char c: charsRead){
            System.out.println((char)c);
        }

        reader.close();
    }

    public static void fileWriting()
        throws FileNotFoundException, IOException{
        FileWriter writer = 
            new FileWriter("D:\\JavaEssentials-Weekday-10-12\\demo.txt", true);
         
        Scanner scan = new Scanner(System.in);
        System.out.print("Give some message... ");
        
        String message = scan.nextLine() + "\n";    
        writer.write(message);

        scan.close();
        writer.close();
    }

    public static void main(String[] args) {
        try{
            fileReading();
            fileWriting();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
