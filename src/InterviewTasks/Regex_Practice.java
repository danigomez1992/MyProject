package InterviewTasks;

public class Regex_Practice {

    public static String removeNonNumChar(String str){
        String myStr = "";
        myStr = str.replaceAll("[^\\d]", "");

        return myStr;
    }
    public static String removeNumChar(String str){
        String myStr = "";
        myStr = str.replaceAll("[^\\d]", "");

        return myStr;
    }

    public static void main(String[] args) {
        System.out.println("removeNonNumChar(\"lets remove 10\") = " + removeNonNumChar("lets remove 10"));
    }
}
