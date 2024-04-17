import java.util.Scanner;

/*9. Write java program using for loop and print your group name 10 times.*/
public class W7q9 {

    public static void main(String[] args) {
        String name;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Your Group Name: ");
        name=s.next();

        for (int i=1;i<=10;i++){

            System.out.println("Group: "+name);
        }
    }
}
