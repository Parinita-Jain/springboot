/*
 * Write a program to create a map that shows the 
 * number of times a character is occuring in the 
 * given string
 * 
 * Input: 
 * hello world
 * 
 * Output:
 * {'h':1,'e':1,'l':3,'o':2,' ':1,'w':1,'r':1,'d':1}
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        //Assuming input: hello world

        Map<Character, Integer> countMap = new HashMap<>();

        char[] inputArray = input.toCharArray();

        //check if the char already exists as the key
        //if yes, then update the count
        //if no, then add a new entry with value 1
        for(char c : inputArray){
            if(countMap.containsKey(c)){
                int count = countMap.get(c) + 1;
                countMap.put(c, count);
            }
            else{
                countMap.put(c, 1);
            }
        }

        System.out.println(countMap);
    }
}
