package InterviewTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersDivisibleBy3_5_15 {

    public static void main(String[] args) {

        divisibleBy3_5_15();
        System.out.println();
        divisibleBy15_5_3();
    }

    public static void divisibleBy3_5_15() {

        String divisibleBy15 = "";
        String divisibleBy3 = "";
        String divisibleBy5 = "";

        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0) {
                divisibleBy15 += i + " ";

            } else if (i % 5 == 0) {
                divisibleBy5 += i + " ";

            } else if (i % 3 == 0) {
                divisibleBy3 += i + " ";
            }
        }
        System.out.println("Numbers divisible by 15 " + divisibleBy15);
        System.out.println("Numbers divisible by 5 " + divisibleBy5);
        System.out.println("Numbers divisible by 3 " + divisibleBy3);
    }

    public static void divisibleBy15_5_3() {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            numbers.add(i);
        }
        System.out.println("Numbers divisible by 15" + numbers.stream().filter(n -> n % 15 == 0).collect(Collectors.toList()));
        System.out.println("Numbers divisible by 5" + numbers.stream().filter(n -> n % 5 == 0).collect(Collectors.toList()));
        System.out.println("Numbers divisible by 3" + numbers.stream().filter(n -> n % 3 == 0).collect(Collectors.toList()));
    }
}
