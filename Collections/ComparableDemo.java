import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("harry");
        names.add("mike");
        names.add("scott");
        names.add("smith");
        names.add("king");

        System.out.println(names);

        Collections.sort(names);

        System.out.println(names);

        List<Integer> nums = new ArrayList<>();

        nums.add(23);
        nums.add(78);
        nums.add(37);

        Collections.sort(nums);

        System.out.println(nums);

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
    }
}
