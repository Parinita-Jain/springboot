public class ImmutableVsMutable {
    public static void main(String[] args) {

        //Immutable Strings
        String s1 = "hello";
        System.out.println(s1);
        System.out.println(s1.hashCode());
        s1 = s1 + "world";
        System.out.println(s1);
        System.out.println(s1.hashCode());

        String s2 = new String("hello");
        System.out.println(s2);
        System.out.println(s2.hashCode());
        s2 = s2.concat("world");
        System.out.println(s2);
        System.out.println(s2.hashCode());

        //Mutable String
        StringBuffer sb1 = new StringBuffer("hello");
        System.out.println(sb1);
        System.out.println(sb1.hashCode());
        sb1.append("world");
        System.out.println(sb1);
        System.out.println(sb1.hashCode());

        StringBuilder sb2 = new StringBuilder("hello");
        System.out.println(sb2);
        System.out.println(sb2.hashCode());
        sb2.append("world");
        System.out.println(sb2);
        System.out.println(sb2.hashCode());
    }
}
