/*21.Write a Java program to sum values of an array.*/
public class W7q21 {
    public static void main(String[] args) {
        int i,sum=0;
        int[] num={1,3,4,6,23,45,67,77};

        for (i=0 ; i<num.length ; i++){

            sum=sum + num[i];

        }
        System.out.println("Sum of Array is: " +sum);
    }
}
