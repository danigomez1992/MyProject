package InterviewTasks.nearestNumber;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NearestNumber {
    public static void main(String[] args) {

/*
find the nearestNumberInArray
ex: List<Integer> numbers = Arrays.asList(1,2,5,8,9,13,21,22,25,50);
 */
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 5, 8, 9, 13, 21, 22, 25, 50));
        System.out.println(nearestNumber(44, numbers));
    }

    public static int nearestNumber(int target, List<Integer> numbers) {

        if (numbers.size() == 1) {
            return numbers.get(0);
        }
        int closestNum = numbers.get(0);
        int distance1 = Math.abs(target - numbers.get(0));

        for (Integer eachNumber : numbers) {
            int currentDistance = Math.abs(target - eachNumber);
            if (currentDistance < distance1) {
                closestNum = eachNumber;
                distance1 = currentDistance;
            }
        }
        return closestNum;
    }
}


