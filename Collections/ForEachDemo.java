import java.util.Arrays;
import java.util.List;

public class ForEachDemo {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("red", "blue", "green",
                                            "blue", "yellow", "pink",
                                            "white", "black", "purple",
                                            "orange", "gray", "maroon",
                                            "violet", "indigo");

        // for(String c : colors){
        //     System.out.println(c);
        // }

        colors.forEach(c -> System.out.println(c));
    }
}
