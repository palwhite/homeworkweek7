import java.util.Scanner;

/*26. Write a Java program to reverse a word.
    Sample Output:
        Input a word: dsaf
        Reverse word: fasd*/
public class W7q26 {

    public static void main(String[] args) {

        String data,rstr="";
        char onec;
        Scanner s=new Scanner(System.in);
        System.out.println("Please Enter String: ");
        data=s.nextLine();

        for (int i=0; i<data.length(); i++){
            onec=data.charAt(i);
            rstr=onec + rstr;
        }
        System.out.println(rstr);

    }
}
