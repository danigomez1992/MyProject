package InterviewTasks.fibonacci;

public class FibonacciNumber {
    public static void main(String[] args) {


        int n1 = 0;
        int n2 = 1;
        int n3;
        int count = 10;

        System.out.print(n1 + " " + n2);//printing 0 and 1

        for (int i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }


        int target = 153;
        int remainder, result = 0;
        int originalNumber = target;

        while(originalNumber != 0){

            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;

        }

        System.out.println(result == target);







        int num = 54;
        int reversed = 0;

        while (num != 0) {
            int eachDigit = num % 10;
            reversed = reversed * 10 + eachDigit;
            num /= 10;
        }
        System.out.println("reversed = " + reversed);
    }
}


