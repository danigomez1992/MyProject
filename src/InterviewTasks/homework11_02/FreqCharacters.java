package InterviewTasks.homework11_02;

public class FreqCharacters {

    public static void main(String[] args) {

        String target = "AAABBBFFCCSDHAHS";

        int count;

        String result = "";


        for (int i = 0; i < target.length(); i++) {
            count = 0;
            for (int j = 0; j < target.length(); j++) {
                if (target.charAt(i) == target.charAt(j)){
                    count++;
            }
        }
        if (!result.contains(target.substring(i, i + 1))) {

            result += "" + target.charAt(i) + count;
        }
    }

        System.out.println(result);
    }
}
