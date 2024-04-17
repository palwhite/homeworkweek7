import java.util.Scanner;

/*8. Write a java program to get numbers from users and print whether it is positive or negative.*/
public class W7q8 {

    public void positivenegative(){

        int positivenegative;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        positivenegative=s.nextInt();

        if (positivenegative>0){
            System.out.println("It Is Positive Number");
        }
        else if (positivenegative<0){
            System.out.println("It is Negative Number");
        }
    }

    public static void main(String[] args) {
        W7q8 q8=new W7q8();
        q8.positivenegative();
    }
}
