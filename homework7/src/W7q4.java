import java.util.Scanner;

/*4. Write if else condition and print your group name in console else others group name.*/
public class W7q4 {

    public static void main(String[] args) {

        String name;
        System.out.println("Enter Name of Group:");
        Scanner s=new Scanner(System.in);
        name=s.nextLine();

        if (name == "Nirali"){
            System.out.println("Group 1");
        }
        else {
            System.out.println("Group 2");
        }
    }
}
