import java.util.Scanner;

/*5. Write a java program to input student Name, roll No, and three subjects Math, Science and English
marks (marks is between 0 to 100 and if it is out of range print error message “InvalidInput, Marks
should between 0 to 100”) and find out total, percentage and result.
If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
%> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
|                   |
|   Mark Sheet      |
|                   |
|                   |
|                   |
|   Name : 08       |
|   Roll No: 23     |
|                   |
|                   |
|                   |
| Subjects : Marks  |
|                   |
| Math : 98         |
| Science: : 90     |
| English : : 85    |
|                   |
| Total : 273       |
|                   |
| Percentage : 91.0 |
| Result : Pass     |
| Grade : A+        |
|                   |*/
public class W7q5 {
    String name,grade,result;
    int rollNo;
    Float Math,Science,English,total;
    Float percentage;
    public void marksheet(){

        Scanner s=new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        name=s.nextLine();
        System.out.println("Enter RollNo: ");
        rollNo=s.nextInt();
        System.out.println("Enter marks of Maths:");
        Math=s.nextFloat();
        System.out.println("Enter marks of Science:");
        Science=s.nextFloat();
        System.out.println("Enter marks of English:");
        English=s.nextFloat();

        if( Math>=0 && Math<=100){
           // System.out.println("valid input");
            if(Science>=0 && Science<=100){
              //  System.out.println("valid input");
                if(English>=0 && English<=100){
                    //System.out.println("valid input");
                    total=Math + Science + English;
                   // System.out.println("Total of marks is: "+ total);
                }
                else {
                    System.out.println("invalid input");
                }
            }
            else {
                System.out.println("invalid input");
            }

        }
        else {
            System.out.println("invalid input");
        }



    }

    public void percentage(){

        percentage=total/300* 100 ;
       // System.out.println("Percentage: "+percentage);

        if (percentage>=35){
            result="Pass";
        }
        else {
            result="Fail";

        }

        if (percentage >= 80 ){
            grade="A+";
        } else if (percentage >= 60 ) {
            grade="A";
        } else if (percentage >= 50) {
            grade="B";
        } else if (percentage >= 35) {
            grade="C";
        }
    }

    public static void main(String[] args) {
        W7q5 q5=new W7q5();
        q5.marksheet();
        q5.percentage();

        System.out.println("|------------------------------------------|");
        System.out.println("|                                          |");
        System.out.println("|               Mark Sheet                 |");
        System.out.println("|__________________________________________|");
        System.out.println("|        Name      : "+q5.name+"              |");
        System.out.println("|        Roll No   : "+q5.rollNo+"            |");
        System.out.println("|__________________________________________|");
        System.out.println("|        Subject   :    Marks              |");
        System.out.println("|        Maths     :   "+q5.Math+"            |");
        System.out.println("|        Science   :   "+q5.Science+"         |");
        System.out.println("|        English   :   "+q5.English+"         |");
        System.out.println("|__________________________________________|");
        System.out.println("|        Total : "+q5.total+"                 |");
        System.out.println("|__________________________________________|");
        System.out.println("|        Percentage :   "+q5.percentage+"     |");
        System.out.println("|        Result     :   "+q5.result+"         |");
        System.out.println("|        Grade      :   "+q5.grade+"          |");
        System.out.println("|__________________________________________|");
    }
}
