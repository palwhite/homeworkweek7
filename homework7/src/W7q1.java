import java.util.Scanner;

/*1. Write a java program that tells us that Input number is odd or even? HINT: use ternary
    operator (? :)*/
public class W7q1 {
    public void oddeven(){
        int x;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number:");
        x=s.nextInt();

        String oddeven= ( x % 2 ) == 0 ? "Even Number" : "Odd Number";

        System.out.println("Given Number is :" + oddeven);
    }

    public static void main(String[] args) {

        W7q1 q1=new W7q1();
        q1.oddeven();
    }
}
