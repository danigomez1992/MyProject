package InterviewTasks.group25;


public class FindUnique {
    /*1. String -- Find the unique
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
     */
    public static void main(String[] args) {

        System.out.println("uniqueChars(\"AAABBBCCCDEF\") = " + uniqueChars("AAABBBCCCDEF"));

    }

    public static String uniqueChars(String str) {

        String uniqueChars = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            int count = 0;
            char target = str.charAt(i);
            for (int j = 0; j <= str.length() - 1; j++) {
                if (target == str.charAt(j)) {
                    count++;
                }
            }
            if (count <= 1) {
                uniqueChars += (str.charAt(i));
            }
        }
        return uniqueChars;
    }
}



