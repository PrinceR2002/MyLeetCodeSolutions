import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddDigits {
    //258. Add Digits
    /*Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.



            Example 1:

    Input: num = 38
    Output: 2
    Explanation: The process is
38 --> 3 + 8 --> 11
        11 --> 1 + 1 --> 2
    Since 2 has only one digit, return it.
            Example 2:

    Input: num = 0
    Output: 0*/
    public static void main(String[] args){
        //Test Cases:
        addDigits(40);
    }
    public static int addDigits(int num) {

        char[] result = String.valueOf(num).toCharArray();


        System.out.println(result[0]+result[1]);

        return 0;
    }
}

