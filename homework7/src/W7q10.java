import java.util.Scanner;

/*10. Write a java program input sales id, seller's name, sales amount, and salary basic and then
    fined this sales
    Commission
        Sales amount >= 50,000 35%
        Sales amount >= 30,000 20%
                     >= 20,000 10%
                     >= 10,000 5%
                     < 10,000 2%*/
public class W7q10 {
    int salesid;
    String sellername;
    Float salesamount , salarybasic;

    public void comission(){

        Scanner s=new Scanner(System.in);
        System.out.println("Enter Sales Id: ");
        salesid=s.nextInt();
        System.out.println("Enter Seller's Name: ");
        sellername=s.next();
        System.out.println("Enter Sales Amount: ");
        salesamount=s.nextFloat();
        System.out.println("Enter Basic Salary: ");
        salarybasic=s.nextFloat();

        if (salesamount>= 50000){
            System.out.println("Commision is 35%");
        } else if (salesamount>= 30000) {
            System.out.println("Comission is 20%");
        } else if (salesamount>= 20000) {
            System.out.println("Comission is 10%");
        } else if (salesamount >= 10000) {
            System.out.println("Comission is 5%");
        } else if (salesamount< 10000) {
            System.out.println("Comission is 2%");
        }
    }

    public static void main(String[] args) {
        W7q10 q10=new W7q10();
        q10.comission();
    }
}
