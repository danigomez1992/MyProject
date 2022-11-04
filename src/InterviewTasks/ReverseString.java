package InterviewTasks;

public class ReverseString {
    public static void main(String[] args) {

        //With char[]
        String str = "boj eht teg lliw I";
        char [] reversed = str.toCharArray();

        for (int i = reversed.length - 1; i >= 0; i--)
            System.out.print(reversed[i]);

        System.out.println();

        //With for loop
        StringBuilder reversed2 = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed2.append(str.charAt(i));
        }
        System.out.println(reversed2);

    }
}
