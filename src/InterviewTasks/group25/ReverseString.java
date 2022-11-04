package InterviewTasks.group25;

public class ReverseString {
    /*2. String -- Reverse
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
     */
    public static void main(String[] args) {

        System.out.println("reversedStr(\"ABCD\") = " + reversedStr("ABCD"));
    }

    public static String reversedStr(String str) {

        String reversed = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
