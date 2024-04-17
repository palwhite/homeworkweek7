import java.util.Scanner;

/*23. Write java program using for loop and print your name 10 times.*/
public class W7q23 {

    public static void main(String[] args) {

        int i;
        String name;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        name=s.nextLine();

        for (i=1 ; i<=10 ;i++){
            System.out.println("Your Name is "+ i +" " + name);
        }
    }
}
