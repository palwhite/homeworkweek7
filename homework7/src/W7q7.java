import java.util.Scanner;

/*7. Write a java program to input any number and find out if it’s odd or even.*/
public class W7q7 {

    public void oddeven(){
        int oddeven;
        Scanner s=new Scanner(System.in);

        System.out.println("Please Enter Your Number: ");
        oddeven=s.nextInt();

        if(oddeven%2==0){
            System.out.println(oddeven+" is Even Number");
        }
        else {
            System.out.println(oddeven+" is Odd Number");
        }
    }

    public static void main(String[] args) {
        W7q7 q7=new W7q7();
        q7.oddeven();
    }
}
