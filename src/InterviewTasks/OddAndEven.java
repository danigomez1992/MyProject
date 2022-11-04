package InterviewTasks;

public class OddAndEven {
    public static void main(String[] args) {

        System.out.println(oddEven(10));

        int number = 2;
        System.out.println(number % 2 == 0 ? "even" : "odd");

    }

    public static String oddEven(int number) {

        String numIs = "";

        if (number % 2 == 0) {
            numIs = "The number " + number + " is even";
        } else {
            numIs = "The number " + number + " is odd";
        }
        return numIs;

    }

}
