package InterviewTasks;

public class Patern {

    public static void main(String[] args) {


        for (int i = 0; i <= 10; i++) {

            System.out.println("*");

            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }

        }


        System.out.println();

        int w = 5;
        int h = 5;

        int space = w * 5;
        int x = 1;
        for (int a = 1; a <= h; a++) {
            for (int i = x; i <= w; i++) {
//loop for space
                for (int j = space; j >= i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
            x = x + 2;
            w = w + 2;
        }
        for (int i = 1; i <= 4; i++) {
            for (int j = space - 3; j >= 1; j--) {
//prints spaces
                System.out.print(" ");
            }
//loop to print t star
            for (int k = 1; k <= 4; k++) {
                System.out.print("* ");
            }
//throws cursor to the next line
            System.out.println();
        }
    }
}

