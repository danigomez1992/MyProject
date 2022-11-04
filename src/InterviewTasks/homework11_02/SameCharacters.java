package InterviewTasks.homework11_02;

import java.util.*;

/*
Write a return method that check if a string is build out of the same letters as another string.
Ex:  same("abc",  "cab"); -> true
same("abc",  "abb"); -> false:

  */
public class SameCharacters {

    public static void main(String[] args) {

        System.out.println("sameChars(\"abc\", \"cab\") = " + sameChars("abc", "cab"));

    }

    public static boolean sameChars(String input1, String input2) {

        char[] first = input1.toCharArray();
        char[] second = input2.toCharArray();
        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);
    }
}


