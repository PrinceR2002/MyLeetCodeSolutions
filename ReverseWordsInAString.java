import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInAString {
//151. Reverse Words in a String

    /*Given an input string s, reverse the order of the words.

    A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.

    Return a string of the words in reverse order concatenated by a single space.

    Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.



    Example 1:

    Input: s = "the sky is blue"
    Output: "blue is sky the"
    Example 2:

    Input: s = "  hello world  "
    Output: "world hello"
    Explanation: Your reversed string should not contain leading or trailing spaces.
    Example 3:

    Input: s = "a good   example"
    Output: "example good a"
    Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.*/
    public static void main(String[] args){

        reverseWords("the sky is blue");
        reverseWords( "  hello world  ");
    }

    public static String reverseWords(String s) {


        //This trims the leading spaces
        s = s.trim();

        //Converts the String into List and splits the words into different indexes.
        List<String> result = Arrays.asList(s.split("\\s+"));

        //Revereses the words
        Collections.reverse(result);


        //Adds the leading spaces
        System.out.println(String.join(" ", result));
        return String.join(" ", result);
    }
}
