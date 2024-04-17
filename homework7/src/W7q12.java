import java.util.Scanner;

/*12. Same as above program-8 using switch statement.*/
public class W7q12 {

    public static void main(String[] args) {
        int number;
        Scanner s=new Scanner(System.in);
        number=s.nextInt();
        System.out.println(number);

        switch(number) {
            case 1:
                System.out.println("Positive number ");
                break;
            case 0:
                System.out.println("Negative number ");
                break;
        }
    }
}
