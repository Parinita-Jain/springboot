import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterfaceDemo {
    public static void main(String[] args) {
        //Set<String> names = new HashSet<>();
        //TreeSet will sort the elements of the set
        //in acsending order
        Set<String> names = new TreeSet<>();

        names.add("mike");
        names.add("scott");
        names.add("jim");
        names.add("leena");
        names.add("harry");
        names.add("jim");

        System.out.println(names);

        names.remove("harry");
        System.out.println(names);

        System.out.println(names.size());
    }
}
