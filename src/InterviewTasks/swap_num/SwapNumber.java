package InterviewTasks.swap_num;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwapNumber {
    public static void main(String[] args) {
/*
 1. Numbers -- Swap Numbers
Swap two variable' values without using a third variable
 */

        System.out.println(swapNumber(5, 10));
    }

    private static String swapNumber(int x, int y) {

        // y = 10 --->   5
        // x = 5  --->   10

        String result = "";
        x = x + y; // 15
        y = x - y; // 5
        x = x - y; // 10

        result = "After swapping:" + " x = " + x + ", y = " + y;

        return result;

    }

}
