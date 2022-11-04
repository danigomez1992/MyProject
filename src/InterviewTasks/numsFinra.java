package InterviewTasks;

public class numsFinra {
    public static void main(String[] args) {

        numsFin();


    }

    public static void numsFin() {

        for (int i = 1; i <= 30; i++) {

            System.out.println(i % 3 == 0 && i % 5 == 0 ? "FINRA" : "FIN");


            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println("FINRA");
            } else if (i % 5 == 0) {
                System.out.println("RA");
            } else if (i % 3 == 0) {
                System.out.println("FIN");
            }
        }
    }


}
