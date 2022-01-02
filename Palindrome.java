/*
 * Palindrome.java
 *
 * Computer Science 112
 *
 * Modifications and additions by:
 *     name:
 *     username:
 */
import java.util.*;   
public class Palindrome {
    // Add your definition of isPal here.
    public static boolean isPal(String input){
        input = removeSymbols(input);
        if( input == null)   
            throw new IllegalArgumentException("Invalid Input");
        if( input.length() == 1 || input.equals(""))
            return true;

        Stack<Character> stack = new ArrayStack<Character>(input.length());
        for(int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }
        String str = "";
        while(!stack.isEmpty())
        {
            str += stack.pop();
        }
        System.out.println(str);
        if(input.equals(str))
            return true;
        else
            return false;
    }
    public static String removeSymbols(String str)
    {
        String str1 = "";
        str = str.toLowerCase();
        for(int i = 0; i < str.length();i++)
        {
            if(Character.isLetter(str.charAt(i))|| Character.isDigit(str.charAt(i)))
                str1 += str.charAt(i);
            else
                str1 += "";
        }
        return str1;
    }
    public static void main(String[] args) {
        System.out.println("--- Testing method isPal ---");
        System.out.println();

        System.out.println("(0) Testing on \"A man, a plan, a canal, Panama!\"");
        try {
            boolean results = isPal("A man, a plan, a canal, Panama!");
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println("true");
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == true);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();


        System.out.println("(1) Testing on \"A\"");
        try {
            boolean results = isPal("");
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println("true");
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == true);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();



        System.out.println("(2) Testing on \"EMPTY STRING\"");
        try {
            boolean results = isPal("");
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println("true");
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == true);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();

        System.out.println("(4) Testing on \"NULL\"");
        try {
            boolean results = isPal(null);
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println("true");
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == true);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        } 
        System.out.println();

        System.out.println("(5) Testing on \"Hello\"");
        try {
            boolean results = isPal("Hello");
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println("False");
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == false);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        
        System.out.println();

        System.out.println("(6) Testing on \"Kayak\"");
        try {
            boolean results = isPal("Kayak");
            System.out.println("actual results:");
            System.out.println(results);
            System.out.println("expected results:");
            System.out.println("True");
            System.out.print("MATCHES EXPECTED RESULTS?: ");
            System.out.println(results == true);
        } catch (Exception e) {
            System.out.println("INCORRECTLY THREW AN EXCEPTION: " + e);
        }
        System.out.println();
        
    }
}