import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TraversingDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();

        names.add("harry");
        names.add("mike");
        names.add("scott");
        names.add("smith");
        names.add("king");

        //1. Using normal for loop (only List)
        System.out.println("Normal For Loop");
        for(int i = 0; i < names.size(); i++){
            System.out.println("index " + i + ": " 
                            + names.get(i));
        }               

        //2. Using enhanced for loop (all)
        System.out.println("\nEnhanced For Loop");
        for(String n : names){
            System.out.println(n);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(23);
        nums.add(78);
        nums.add(37);

        for(Integer i : nums){
            System.out.println(i);
        }

        Map<String, Integer> scores = new HashMap<>();
        scores.put("term1", 47);
        scores.put("term2", 56);
        scores.put("term3", 53);

        for(Entry<String,Integer> e : scores.entrySet()){
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        System.out.println(names);

        //3. Using Iterator interface (all)
        //unidirectional (we can read value in one direction)
        System.out.println("\nIterator interface");

        Iterator<Integer> iter = nums.iterator();

        // System.out.println(iter.hasNext());
        // System.out.println(iter.next());
        // System.out.println(iter.hasNext());
        // System.out.println(iter.next());
        // System.out.println(iter.hasNext());
        // System.out.println(iter.next());
        // System.out.println(iter.hasNext());
        // System.out.println(iter.next());

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        //4. Using ListIerator interface (only list)
        //bidirectional

        ListIterator<String> listIter = names.listIterator();

        System.out.println(listIter.next());
        System.out.println(listIter.next());
        System.out.println(listIter.previous());
        System.out.println(listIter.previous());
    }
}
