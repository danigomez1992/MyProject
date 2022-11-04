package InterviewTasks.homework11_02;

public class trying {

    public static void main(String[] args) {


        String first = "dani";
        String second = "nadi";
        boolean r = false;

        for (int i = 0; i <= first.length() - 1; i++) {
            if (first.contains("" + second.charAt(i)) && first.length() == second.length()) {
                r = true;
                break;
            }
        }
        System.out.println(r);

        System.out.println();

        String str = "AAABBCDD";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            char each = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);

                if (each == ch) {
                    count++;
                }
            }
            if (!(result.contains("" + each))) {
                result += count;
                result += each;
            }
        }
        System.out.println(result);

    }


}
