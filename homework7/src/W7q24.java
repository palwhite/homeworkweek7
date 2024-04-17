import java.util.Scanner;

/*24. Write java program using for loop and print surname 9 times.*/
public class W7q24 {
    public static void main(String[] args) {

        int i;
        String surname;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your SurName: ");
        surname=s.nextLine();

        for (i=1 ; i<=9 ;i++){
            System.out.println("Your SurName is "+ i +" " + surname);
        }
    }
}
