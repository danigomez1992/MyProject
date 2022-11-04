package InterviewTasks;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArmstrongNumbers {
    public static void main(String[] args) {

        int num = 153;
        System.out.println(num + " is Armstrong number = " + isArmstrong(num));
    }

    public static boolean isArmstrong(int number) {

        int originalNumber, remainder, result = 0;
        originalNumber = number;

        while (originalNumber != 0) {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }
        return result == number;
    }
}
