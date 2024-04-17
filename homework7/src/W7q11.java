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

        switch (data) {
            case "A": { System.out.println("Agra");}
            case "B" :{ System.out.println("Berlin");}
            case "C" :{ System.out.println("Cairo");}
            case "D" :{ System.out.println("Dallas");}
            case "E" :{ System.out.println("EE");}
            case "F" :{ System.out.println("Freetown");}
            default :{ System.out.println("Invalid Input");}
        }
    }

    public static void main(String[] args) {
        W7q11 q11=new W7q11();
        q11.city();
    }
}
