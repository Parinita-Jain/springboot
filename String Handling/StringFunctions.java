public class StringFunctions {
    public static void main(String[] args) {
        String message = "Good Morning! How are you?";

        System.out.println(message.charAt(0));
        System.out.println(message.charAt(2));

        System.out.println("Number of characters: " + message.length());

        System.out.println(message.toUpperCase());
        System.out.println(message.toLowerCase());

        System.out.println(message.concat(" I'm fine"));

        System.out.println(message.substring(0, 4));

        System.out.println(message.substring(14));

        System.out.println(message.contains("z"));

        System.out.println(message.startsWith("G"));

        System.out.println(message.endsWith("?"));

        //number of words in the string
        String[] words = message.split(" ");
        System.out.println(words[1]);    

        System.out.println("Number of words: " + words.length);

        /*
         * Write a program to find the number of vowels 
         * in the given string
         */

        //extract individual characters
        char[] characters = message.toCharArray();
        System.out.println(characters[0]);

        int vowelCount = 0;
        for(char c : characters){
            if(c == 'a' || c == 'e' || c == 'i' 
                        || c == 'o' || c == 'u'){
                vowelCount++;
            }
        }

        System.out.println("Number of Vowels: " + vowelCount);

        ////////////////////////////////////////
        StringBuffer sb = new StringBuffer("Java is secure");

        sb.append(" and robust");

        System.out.println(sb);

        // System.out.println(sb.insert(0, "Hello, "));

        System.out.println(sb.replace(0, 4, "Python"));

        System.out.println(sb.reverse());

    }
}
