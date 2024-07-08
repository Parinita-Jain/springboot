import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFileDemo {
    public static void main(String[] args) {
        //since we will work on non-textual file
        //we will use byte streaming

        try{
            File fileRead = new File("d:\\JavaEssentials-Weekday-10-12\\java.png");
            File fileWrite  = new File("d:\\JavaEssentials-Weekday-10-12\\java_copy.png");

            if(fileRead.getAbsolutePath() == fileWrite.getAbsolutePath())
            {
                System.out.println("Same file");
            }
            else{
                FileInputStream fis = 
                    new FileInputStream(fileRead);

                FileOutputStream fos = 
                    new FileOutputStream(fileWrite);
        
                byte[] readImage = new byte[fis.available()];
                fis.read(readImage); //read the original file

                fos.write(readImage);

                System.out.println("File Copied");

                fis.close();
                fos.close();    
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
