package InterviewTasks.nearestNumber;

import java.util.Arrays;
import java.util.List;

public class NearestByRul {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 8, 9, 13, 21, 22, 25, 50);

        System.out.println(neighborNum(numbers, 7));

    }

    public static int neighborNum(List<Integer> numbers, int num) {
        int returnValue = 0;
        for (int i = 0; i < numbers.size(); i++) {//i=2
            if (num == numbers.get(i)) {//5
                returnValue = num;
            } else if (num >= numbers.get(i) && num <= numbers.get(i + 1)) {
                double median = (numbers.get(i) + numbers.get(i + 1)) / 2; //6.5
                returnValue = (num > median) ? numbers.get(i + 1) : numbers.get(i);
            }
        }

        return returnValue;
    }
}

