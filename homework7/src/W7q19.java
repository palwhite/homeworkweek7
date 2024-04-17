import java.util.Scanner;

/*19. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or“ZERO”*/
public class W7q19 {

    public static void main(String[] args) {

        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        x=s.nextInt();

        if (x>=0){
            System.out.println("Number is Positive.");
        }else if(x<=0){
            System.out.println("Number is Negative.");
        }
        else {
            System.out.println("Number is Zero");
        }
    }
}
