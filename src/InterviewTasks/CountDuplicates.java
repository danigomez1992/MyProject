package InterviewTasks;

public class CountDuplicates {
    public static void main(String[] args) {

        String s = "aaabbccc";
        int count;
        char c;

        for (int i = 0; i < s.length(); ) {
            c = s.charAt(i);
            count = 1;
            i++;
            while (i < s.length() && c == s.charAt(i)) {
                count++;
                i++;
            }
            System.out.print(c + "" + count);
        }

    }
}
