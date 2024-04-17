import java.util.Scanner;

/*6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Grosssalary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PFPrint in following format
| Salary Slip               |
|                           |
|                           |
| Employee Id : 2564        |
| Employee Name : Jay       |
|                           |
| Basic Salary : 25000.0    |
| HRA 10% : 2500.0          |
| TA 8% : 2250.0            |
| DA 9% : 2000.0            |
| PF - 20& : 5000.0         |
|                           |
| Gross Salary : 26750.0    |
|===========================|*/
public class W7q6 {

    int employeeid;
    String name;
    Float basicsalary,HRA, TA, DA, PF, Grosssalary;

    public void employee(){

        Scanner s=new Scanner(System.in);
        System.out.println("Employee ID:");
        employeeid=s.nextInt();
        System.out.println("Employee Name: ");
        name=s.next();
        System.out.println("Basic Salary: ");
        basicsalary=s.nextFloat();

        HRA=basicsalary * 10/100;
        TA=basicsalary * 8/100;
        DA=basicsalary * 9/100;
        PF= basicsalary * 20/100;
        Grosssalary= basicsalary+HRA+TA+DA-PF;

        System.out.println("|==========================================|");
        System.out.println("| Salary Slip                              |");
        System.out.println("|                                          |");
        System.out.println("|                                          |");
        System.out.println("| Employee Id : "+employeeid+"             |");
        System.out.println("| Employee Name : "+name+"                 |");
        System.out.println("|                                          |");
        System.out.println("| Basic Salary : "+basicsalary+"           |");
        System.out.println("| HRA 10% : "+HRA+"                        |");
        System.out.println("| TA 8% : "+TA+"                           |");
        System.out.println("| DA 9% : "+DA+"                           |");
        System.out.println("| PF - 20& : "+PF+"                        |");
        System.out.println("|                                          |");
        System.out.println("| Gross Salary : "+Grosssalary+"           |");
        System.out.println("|==========================================|");
    }

    public static void main(String[] args) {
        W7q6 q6=new W7q6();
        q6.employee();
    }
}
