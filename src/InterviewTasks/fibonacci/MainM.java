package InterviewTasks.fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainM {
    public static void main(String[] args) {


        int num1 = 0;
        int num2 = 1;
        int num3;
        int count = 10;

        System.out.print(num1 + " " + num2);

        for (int i = 2; i < count; ++i) {

            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }


        System.out.println();

        int first = 0;
        int second = 1;
        int third;

        List<Integer> list = new ArrayList<>(Arrays.asList(first, second));

        for (int i = 2; i < count; ++i) {

            third = first + second;
            list.add(third);
            first = second;
            second = third;

        }

        System.out.println(list);


        String name = "uoy evol I";
        String reversed = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            reversed += name.charAt(i) + "";

        }

        System.out.println(reversed);


        List<Integer> stringList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        List<Integer> reversedList = new ArrayList<>();

        for (int i = stringList.size() - 1; i > 0; i--) {

            reversedList.add(stringList.get(i));

        }

        System.out.println(reversedList);


        String letters = "aabbcccd";

        System.out.println(letters.length());
        System.out.println(letters.charAt(letters.length() - 1));
        System.out.println(letters.substring(2, 4));


        int target = 153;
        int num = target;
        int remainder, result = 0;



        while (num != 0) {

            remainder = num % 10;
            result += (remainder * remainder * remainder);
            num /= 10;
        }

        System.out.println("Number " + target + " is Armstrong number = " + (result == target));



    }


}
