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


        int s = 150;
        int p = 122;

        System.out.println("s = " + s + " and p = " + p);
        s = p + s; // 55
        p = p + s; // 65
        s = p - s; // 10
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


    }
}
