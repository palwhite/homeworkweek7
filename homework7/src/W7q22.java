/*22. Write a Java program to calculate the average value of array elements.*/
public class W7q22 {
    public static void main(String[] args) {
        int sum=0,avg;
        int[] num={1,3,4,6,23,45,67,77};

        for (int i=0 ; i<num.length ; i++){

            sum=sum + num[i];

        }
        avg=sum/ num.length;
        System.out.println("Average of Array is: " +avg);
    }
}
