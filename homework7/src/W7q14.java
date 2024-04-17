import java.util.Scanner;

/*14. Write a java program to print the numbers between 1 to 100 which can be divided by 3and
    5 separately.*/
public class W7q14 {

    public static void main(String[] args) {
        int a;
        Scanner s=new Scanner(System.in);
        System.out.println("Please enter your Number: ");
        a=s.nextInt();

        if (a<=100 && a>=0)
        {
           if (a%3==0){
                System.out.println("Number can be divided by 3");
            }
           else if (a%5==0) {
                System.out.println("Number can be divided by 5");
            }
            else {
                System.out.println("Can not be Divided by 3 or 5");
            }
        }
        else {
            System.out.println("Please Enter valid Number");
        }
    }
}
