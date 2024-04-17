import java.util.Scanner;

/*15. Write a program that tells us input value is number or an alphabet or symbol.*/
public class W7q15 {
    public static void main(String[] args) {
        char x;
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Your data: ");
        x=s.next().charAt(0);

        if ((x >= 65 && x <= 90) || (x >= 97 && x <= 122)) {
            System.out.println("Alphabet");
        }
            // CHECKING FOR DIGITS
        else if (x >= 48 && x <= 57) {
            System.out.println("number");
        }
            // OTHERWISE SPECIAL CHARACTER
        else {
            System.out.println("Special Character");
        }
    }
}
