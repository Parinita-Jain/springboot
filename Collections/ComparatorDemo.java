import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StudentSortById implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        Integer id1 = o1.getId(); //autoboxing
        Integer id2 = o2.getId(); //autoboxing
        return id1.compareTo(id2);
    }
}

class StudentSortByName implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class StudentSortByAge implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        Integer age1 = o1.getAge();
        Integer age2 = o2.getAge();
        return age1.compareTo(age2);
    }
}

class StudentSortByMarks implements Comparator<Student>{
    @Override
    public int compare(Student o1, Student o2) {
        Double m1 = o1.getMarks();
        Double m2 = o2.getMarks();
        return m1.compareTo(m2);
    }
}

public class ComparatorDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(2, "mike", 16, 90.46));
        students.add(new Student(1, "harry", 16, 87.56));
        students.add(new Student(4, "king", 15, 45.45));
        students.add(new Student(3, "dan", 17, 69.27));
        students.add(new Student(5, "ron", 16, 80.56));

        //Here sorting is possible only if the 
        //class Student implements Comparable interface
        //in which we will specify the default attribute
        //which will be actually sorted
        Collections.sort(students);

        System.out.println(students);

        Collections.sort(students, new StudentSortByName());

        System.out.println(students);

        Collections.sort(students, new StudentSortByMarks());

        System.out.println(students);
    }
}
