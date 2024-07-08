import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "blue", "green",
                                            "blue", "yellow", "pink",
                                            "white", "black", "purple",
                                            "orange", "gray", "maroon",
                                            "violet", "indigo");

        Stream<String> colorsStream = colors.stream();

        //display the colors containing "i" in their name
        colorsStream.filter(n -> n.contains("e"))
                    .forEach(n -> System.out.println(n));

        List<Double> tempInC = Arrays.asList(34.64, 37.90, 40.35, 28.34);

        tempInC.stream()
               .filter(c -> c < 35)
               .map(c -> (c * 9 / 5) + 32)
               .forEach(c -> System.out.println(c));

        List<Student> students = new ArrayList<>();

        students.add(new Student(2, "mike", 16, 90.46));
        students.add(new Student(1, "harry", 16, 87.56));
        students.add(new Student(4, "king", 15, 45.45));
        students.add(new Student(3, "dan", 17, 69.27));
        students.add(new Student(5, "ron", 16, 80.56));

        //display the names of the student who have scored 
        //more that 80

        students.stream()
                .filter(s -> s.getMarks() > 80)
                .forEach(s -> System.out.println(s.getName()));

        //display the names of the student who are 
        //16 years old

        students.stream()
                .filter(s -> s.getAge() == 16)
                .forEach(s -> System.out.println("ID: " + s.getId() 
                                    + "\nName: " + s.getName()));

        List<String> studentsAge16 = 
                    students.stream()
                            .filter(s -> s.getAge() == 16)
                            .map(s -> s.getName())
                            .collect(Collectors.toList());

        System.out.println(studentsAge16);

        System.out.println("Parallel Streaming");

        colors.parallelStream()
              .filter(v -> v.contains("o"))
              .forEach(c -> System.out.println(c));

    }
}
