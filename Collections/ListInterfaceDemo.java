import java.util.ArrayList;
import java.util.List;

public class ListInterfaceDemo {
    public static void main(String[] args) {
        List myList = new ArrayList();

        //Add the values in the list
        //By default all collections are
        //heterogeneours in nature means we can stored
        //different types of values in the collection
        myList.add(6); //here when we are storing 6, its
                        //autoboxed first as the Integer object
                        //and then object is added in the collection
        myList.add(45.34f);
        myList.add("hello");
        myList.add(true);
        myList.add(6);
        myList.add(783);

        //Access the elements using index number
        //Since list is ordered, each element gets an index number
        
        System.out.println(myList.get(1));
        myList.add(3, 19);

        //Changing the element value
        myList.set(2, "world");

        //Display all the values
        System.out.println(myList);

        //Remove the element
        myList.remove(0);
        System.out.println(myList);

        myList.remove(true);
        System.out.println(myList);

        myList.clear();
        System.out.println(myList);        
    }
}
