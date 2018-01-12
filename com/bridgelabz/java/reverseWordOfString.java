
/*Q. Write a program to reverse the words of the given string.
    eg. Hello Vaibhav! Welcome to Bridgelabz
    o/p: olleH !vahbiaV emocleW ot zbalegdirB*/

//  reverse each word of string //
public class ReverseEachWord
{
    static void reverseEachWordOfString(String inputString)
    {
        String[] words = inputString.split(" ");
         
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println(inputString);
          System.out.println("-------------------------");
        System.out.println(reverseString);
    }
     
    public static void main(String[] args) 
    {
         reverseEachWordOfString("Hello Vaibhav! Welcome to Bridgelabz");
    }
}

// reverse word into the string//
// Java Program to reverse a String
// without using inbuilt String function
import java.util.regex.Pattern;
public class Exp {
 
    // Method to reverse words of a String
    static String reverseWords(String str)
    {
 
        // Specifying the pattern to be searched
        Pattern pattern = Pattern.compile("\\s");
 
        // splitting String str with a pattern
        // (i.e )splitting the string whenever their
        //  is whitespace and store in temp array.
        String[] temp = pattern.split(str);
        String result = "";
 
        // Iterate over the temp array and store
        // the string in reverse order.
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1)
                result = temp[i] + result;
            else
                result = " " + temp[i] + result;
        }
        return result;
    }
 
    // Driver methods to test above method
    public static void main(String[] args)
    {
        String s1 = "Hello Vaibhav! Welcome to Bridgelabz";
        System.out.println(reverseWords(s1));
    }
}
