package InterviewTasks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicatesMap {
    public static void main(String[] args) {


        System.out.println("freqAllChars(\"aaabbcdd\") = " + freqAllChars("aaabbcdd"));
    }


    public static Map<String, Integer> freqAllChars(String sentence) {

        int value = 0;

        List<String> charList = Arrays.asList(sentence.split(""));

        Map<String, Integer> charsMap = new HashMap<>();
        for (String chars : charList) {

            if (charsMap.containsKey(chars.toLowerCase().trim())) {

                charsMap.put(chars, charsMap.get(chars) + 1);
            } else {
                charsMap.put(chars, 1);
            }
        }
        return charsMap;
    }

}
