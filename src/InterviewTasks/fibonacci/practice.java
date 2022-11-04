package InterviewTasks.fibonacci;

import java.rmi.MarshalException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class practice {

    public static void main(String[] args) {

        System.out.println("*************** Reversed *****************");

        int number = 59;
        int reversed = 0;

        while (number != 0) {                      // 1) number = 59 (true)    2) number = 5  (true)     3) number = 0  (false/stop)

            int remaining = number % 10;           //  1) remaining = 9        2) remaining = 5 (5 % 10)
            reversed = reversed * 10 + remaining;  //  1) reversed = 9         2) reversed = 95 (90 + 5)
            number /= 10;                          //  1) number = 5.9 --> 5   2) number = 0.5 --> 0

        }

        System.out.println(reversed);

        System.out.println(9 % 10);
        System.out.println(9 / 10);


        System.out.println("************* Armstrong Number **************");
        int target = 153;
        int originalNumber = target;
        int lastDigit = 0;
        int result = 0;

        while (originalNumber != 0) {

            lastDigit = originalNumber % 10;
            result += Math.pow(lastDigit, 3);
            originalNumber /= 10;

        }
        System.out.println(result == target);


        System.out.println("***************** Fibonacci *******************");

        int targetF = 10;

        int num1 = 0, num2 = 1, num3;

        String resultF = num1 + " " + num2;

        for (int i = 2; i <= targetF; ++i) {

            num3 = num1 + num2;
            resultF += " " + num3;
            num1 = num2;
            num2 = num3;

        }
        System.out.println(resultF);

        System.out.println("***************** Reverse String *******************");

        String word = "!dlroW olleH";
        String reversedStr = "";

        for (int i = word.length() - 1; i >= 0; i--) {

            reversedStr += word.charAt(i);
        }

        System.out.println(reversedStr);

        System.out.println("**************** Reversed Array ***************");

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        List<Integer> reversedNumbers = new ArrayList<>();

        for (int i = numbers.length - 1; i >= 0; i--) {
            reversedNumbers.add(numbers[i]);
        }
        System.out.println(reversedNumbers);

        System.out.println("********************** String proper format ********************");

        String sentence = "hello World! mY naMe is daNieLa. I AM frOm cOlomBia";

        String proper = sentence.toLowerCase();

        List<String> properWords = List.of(proper.split(" "));

        for (String eachWord : properWords){

            System.out.print(eachWord.substring(0,1).toUpperCase() + eachWord.substring(1).toLowerCase() + " ");


        }

    }

}
