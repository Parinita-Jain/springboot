class AgeException extends Exception //checked exception
{
    AgeException(){
        super("Age should be between 18 and 30");
    }
}

class MarksException extends Exception{ //checked exception
    MarksException(){
        super("Marks should be greater than or equal to 0");
    }
}

class Student{
    private int id;
    private String name;
    private int age;
    private float marks;

    public Student(int id, String name, int age, float marks)
        throws AgeException, MarksException{
        this.id = id;
        this.name = name;
        if(age < 18 || age > 30)
            throw new AgeException();
        else        
            this.age = age;

        if(marks < 0)
            throw new MarksException();
        else 
            this.marks = marks;
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        try{
            Student s = new Student(1, "harry", 15, 78.45f);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
