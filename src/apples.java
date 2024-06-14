//import
import java.util.Scanner;
class apples{
    public static void main(String []args){

        int test;
        Scanner Bucky = new Scanner(System.in);
        System.out.print("Guess A Number: ");
        test = Bucky.nextInt();

        if (test == 9){
            System.out.println("Test");
        }
        else{
            System.out.println("Test2");
        }
    }
}
