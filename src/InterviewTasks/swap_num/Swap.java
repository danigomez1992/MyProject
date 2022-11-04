package InterviewTasks.swap_num;

public class Swap {
    public static void main(String[] args) {

        System.out.println("First way: ");

        int x = 15;
        int y = 20;
        System.out.println("x = " + x + " and y = " + y);

        int temp = y + x; // temp =  35     x = 15    y = 33
        x = temp - x;
        y = temp - y;

        System.out.println("x = " + x + " and y = " + y);


        System.out.println("\nSecond way:");


        int s = 2;
        int p = 5;

        System.out.println("s = " + s + " and p = " + p);
        s = p + s; // 7
        p = p + s; // 12
        s = p - s; // 5
        p = p - (s * 2);

        System.out.println("s = " + s + " and p = " + p);


        System.out.println("\nThird way:");
        int d = 2;
        int e = 12;
        System.out.println("d = " + d + " and e = " + e);

        d = e * d; // 24
        e = d / e; // 2
        d = d / e;

        System.out.println("d = " + d + " and e = " + e);


        System.out.println("\nFourth way:");

        int f = 5;
        int g = 32;
        System.out.println("f = " + f + " and g = " + g);

        int[] allNum = {f, g};

        for (int each : allNum) {
            if (each == allNum[0]) {
                g = each;
                f = allNum[1];
            }
        }
        System.out.println("f = " + f + " and g = " + g);

        System.out.println("\nFifth way:");

        int h = 10; // --> 15
        int i = 15; // --> 10
        System.out.println("h = " + h + " and i = " + i);

        h = h + i; // 25 --> new value of h and i is the same original value
        i = h - i; // 10 --> here we are assigning a new value to i doing ( 25(h) - 15(i)) = 10 -> we swap the first number
        h = h - i; // 15 --> here the value of h is the same as the previous step
        //    15 = 25 - 10
        System.out.println("h = " + h + " and i = " + i);


    }
}
