import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamingDemo{

    public static void fileReading()
        throws FileNotFoundException, IOException{
        FileInputStream fis = 
            new FileInputStream("D:\\JavaEssentials-Weekday-10-12\\demo.txt");
    
        //FileReading - Byte by byte reading
        // int reads = fis.read();

        // while(reads != -1){
        //     System.out.println((char)reads);
        //     reads = fis.read(); 
        // }    

        //FileReading - in byte array
        byte[] readBytes = new byte[fis.available()];

        fis.read(readBytes); //reading is happening once

        for(byte b : readBytes){
            System.out.println((char)b);
        }

        fis.close();
    }

    public static void fileWriting()
        throws FileNotFoundException, IOException{
        FileOutputStream fos = 
            new FileOutputStream("D:\\JavaEssentials-Weekday-10-12\\sample.txt", true);

        //to write anything in the file using ByteStreaming 
        //we will have to convert that into byte format
        Scanner scan = new Scanner(System.in);
        System.out.print("Give some message... ");
        
        String message = scan.nextLine() + "\n";
        byte[] msgBytes = message.getBytes();

        fos.write(msgBytes);

        scan.close();
        fos.close();
        
    }
    public static void main(String[] args) {
        try{
            fileReading();
            fileWriting();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}