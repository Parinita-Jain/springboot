import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
    private int id;
    private String name;
    private int age;
    private transient float marks;
    //transient modifier is used to mark the field 
    //in the class whose data you don't want to
    //serialize
    private transient String password;

    public Student(int id, String name, int age, float marks, String password) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + 
               ", name=" + name + 
               ", age=" + age + 
               ", marks=" + marks + 
               ", password=" + password + 
               "]";
    }    
}

public class SerializationDemo {

    public static void serialize(Student s)
        throws FileNotFoundException, IOException{
        //Here we creating the stream to write into the file
        FileOutputStream fos = 
                new FileOutputStream("D:\\JavaEssentials-Weekday-10-12\\object.txt");
    
        //We cannot write Student object directly in the file
        //we will have convert it in to byte-format
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        
        //This function we convert the Student object into byte-format
        //and also write the byte data into the file
        oos.writeObject(s);

        oos.close();
        fos.close();
    }

    public static Student deserialize()
        throws FileNotFoundException, IOException, 
                ClassNotFoundException{
        FileInputStream fis = 
            new FileInputStream("D:\\JavaEssentials-Weekday-10-12\\object.txt");

        ObjectInputStream ois = new ObjectInputStream(fis);
        
        //readObject method will read the data from the file
        //in byte-format and then converts into Student object
        Student s = (Student)ois.readObject();

        ois.close();
        fis.close();

        return s;
    }

    public static void main(String[] args) {
        //This Student object we want to save in the file
        Student s = new Student(1, "mike", 18, 94.34f,"abcd1234");

        try{
            serialize(s);
            Student stud = deserialize();
            System.out.println("After Deserialize");
            System.out.println(stud);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
