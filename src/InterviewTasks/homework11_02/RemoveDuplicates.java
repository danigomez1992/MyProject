package InterviewTasks.homework11_02;

import java.util.HashSet;
import java.util.Set;

/*
String -- Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC")  ==> ABC
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println("removeDuplicates(\"AAABBBCCC\") = " + removeDuplicates("AAABBBCCC"));

    }

    public static String removeDuplicates(String original) {

        char[] chars = original.toCharArray();
        Set<Character> set = new HashSet<>();
        String noDuplicates = "";

        for (char each : chars) {
            set.add(each);
        }
        for (Character each : set) {
            noDuplicates += each + "";
        }

        return noDuplicates;
    }
}
