package InterviewTasks.homework11_02;

/*
String -- Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */
public class CharFreq {

    public static void main(String[] args) {

        System.out.println("freqOfChars(\"AAABBCDD\") = " + freqOfChars("AAABBCDD"));
 //                                       AAABBCDD
    }

    public static String freqOfChars(String str) {

        String freqChar = "";
        int[] freq = new int[str.length()];
        char[] chars = str.toCharArray();

        for (int i = 0; i <= str.length() - 1; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        for (int i = 0; i <= freq.length - 1; i++) {
            if (chars[i] != ' ' && chars[i] != '0')
                freqChar += chars[i] + "" + freq[i];
        }
        return freqChar;
    }
}