package InterviewTasks;

public class PrimeNumber {
    public static void main(String[] args) {

        int num1 = 13;
        int num2 = 2;
        System.out.println(num1 + " is a prime number = " + isPrimeNumber(num1));
        System.out.println(num2 + " is a prime number = " + isPrimeNumber(num2));
    }

    public static boolean isPrimeNumber(int n) {  //10

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) { // ***
                count++;
            }
        }
        return count < 2 ; //f
    }
}
