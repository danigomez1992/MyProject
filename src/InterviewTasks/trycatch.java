package InterviewTasks;

public class trycatch {


    public static void main(String[] args) {

        try{
            String [] arr  = {"hello", " world", "java","testing"};
            System.out.println(arr[10]);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("A");
        }catch (RuntimeException e){
            System.out.println("B");
        }catch(Exception e){
            System.out.println("C");
        }





    }
}
