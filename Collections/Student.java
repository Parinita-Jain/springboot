public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;
    private double marks;

    public Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "\nStudent [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + "]";
    }

    @Override
    //compareTo method is called on one Student object
    //and second Student object is passed as the 
    //parameter
    public int compareTo(Student o) {
        //choosen name as the default attribute
        // return -this.name.compareTo(o.name);

        //choosen id as the default attribute
        Integer id1 = this.id;
        Integer id2 = o.id;
        return id1.compareTo(id2);

        //choosen age as the default attribute
        // Integer age1 = this.age;
        // Integer age2 = o.age;
        // return -age1.compareTo(age2);
    }
}
