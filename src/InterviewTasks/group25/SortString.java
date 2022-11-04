package InterviewTasks.group25;

import java.util.Arrays;
import java.util.List;

public class SortString {
    /* 3. String -- Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899" */
    public static void main(String[] args) {

        System.out.println("sortChars(\"DC501GCCCA098911\") = " + sortChars("DC501GCCCA09891S"));
    }

    public static String sortChars(String str) {

        StringBuilder divided = new StringBuilder();

        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.isAlphabetic(str.charAt(i)) && Character.isDigit(str.charAt(i + 1))) {
                divided.append(str.charAt(i)).append(", ");
            } else if (Character.isDigit(str.charAt(i)) && Character.isAlphabetic(str.charAt(i + 1))) {
                divided.append(str.charAt(i)).append(", ");
            } else {
                divided.append(str.charAt(i));
            }
        }
        divided.append(str.charAt(str.length() - 1));

        List<String> list = List.of(divided.toString().split(", "));
        StringBuilder sorted = new StringBuilder();

        for (String each : list) {
            char[] chars = each.toCharArray();
            Arrays.sort(chars);
            sorted.append(new String(chars));
        }
        return sorted + "";
    }
}
