import java.util.Scanner;

/*11. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) ifany
        other alphabet should be invalid entry.*/
public class W7q11 {

    String data;

    public void  city(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        data=s.next();
        data=data.toUpperCase();

        if (data.equals("A")){
            System.out.println("Agra");
        }
        else if (data.equals("B"))
        {
            System.out.println("Berlin");
        }
        else if (data.equals("C"))
        {
            System.out.println("Cairo");
        }
        else if (data.equals("D"))
        {
            System.out.println("Dallas");
        }
        else if (data.equals("E"))
        {
            System.out.println("EE");
        }
        else if (data.equals("F"))
        {
            System.out.println("Freetown");
        }
        else {
            System.out.println("Invalid Input");
        }
    }

    public static void main(String[] args) {
        W7q11 q11=new W7q11();
        q11.city();
    }
}
