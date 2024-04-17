import java.util.Scanner;

/*13. Write a java program to input any two number and ask user to enter their symbol (+, -, /, *)
        find addition, Subtraction, multiplication and division according to theirsymbol(using if else)*/
public class W7q13 {
    int a,b,result;
    String action;
    public void calculator(){

        Scanner s=new Scanner(System.in);
        System.out.println("Enter First Number: ");
        a=s.nextInt();
        System.out.println("Enter Second Number: ");
        b=s.nextInt();
        System.out.println("Enter the action you want to perform:");
        action=s.next();

        if (action.equals("+")){
            result=a+b;
            System.out.println("Result of your action is: "+ result);
        }
        else if (action.equals("-"))
        {
            result=a-b;
            System.out.println("Result of your action is: "+ result);
        }
        else if (action.equals("*"))
        {
            result=a*b;
            System.out.println("Result of your action is: "+ result);
        }
        else if (action.equals("/"))
        {
            result=a/b;
            System.out.println("Result of your action is: "+ result);
        }
        else {
            System.out.println("Please enter valid action");
        }
    }

    public static void main(String[] args) {
        W7q13 q13=new W7q13();
        q13.calculator();
    }
}
