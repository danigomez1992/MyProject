package InterviewTasks;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(reversedNegative(-51));

    }

    public static int reversedNegative(int num) {

        int reversed = 0;

        while (num < 0) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;
        }
        return reversed;
    }
}
