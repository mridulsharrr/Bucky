import java.util.Scanner;
class apples{
    public static void main(String []args){
        //get age to switch

        Scanner INPage = new Scanner(System.in);

        int age;

        System.out.print("What is your age: ");
        age = INPage.nextInt();
        //switch code at age
        switch (age){
            case 1:
                System.out.println("You are 1");
                break;
            case 2:
                System.out.println("You can talk");
                break;
            case 3:
                System.out.println("You Are 3");
                break;
            default:
                System.out.print("It's okay");
                break;
        }
    }
}
