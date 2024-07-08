public class StringComparison {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";

        //here the address stored in s1 and s2 is compared
        if(s1 == s2)
            System.out.println("Both string are same");
        else
            System.out.println("Strings are not same");

        String st1 = new String("java");
        String st2 = new String("java");

        //Here also the address stored in st1 and st2 is compared
        //which are different, as they are referring two
        //different objects
        if(st1 == st2)
            System.out.println("Both string are same");
        else
            System.out.println("Strings are not same");

        //Here the value of the object referred by st1 
        //and st2 is compared
        if(st1.equals(st2))
            System.out.println("Both string are same");
        else
            System.out.println("Strings are not same");

        //Here the value of the object referred by st1 
        //and st2 is compared
        if(st1.compareTo(st2) == 0)
            System.out.println("Both string are same");
        else
            System.out.println("Strings are not same");
    }
}
