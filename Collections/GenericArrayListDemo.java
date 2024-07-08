import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericArrayListDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(7);
        nums.add(4);
        nums.add(8);
        nums.add(9);

        System.out.println("Number of elements in the list " + nums.size());

        System.out.println(nums);

        List<Integer> nums2 = Arrays.asList(1,2,3,4,5);
        nums.removeAll(nums2);
        System.out.println(nums);

        //Arrays.asList will convert an array into List
        // String[] colorNames = {"red", "blue", "green", 
        //                        "yellow", "black", "white",
        //                        "pink", "orange"};

        // List<String> colors = Arrays.asList(colorNames);

        List<String> colors = Arrays.asList("red", "blue", 
                                    "green", "yellow", 
                                    "black", "white",
                                    "pink", "orange");

        System.out.println(colors);

        //Convert List into array
        Integer[] numsArray = nums.toArray(new Integer[0]);
        System.out.println("Number of elements in the array " + numsArray.length);
    }
}
