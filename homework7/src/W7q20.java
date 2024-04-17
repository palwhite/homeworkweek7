import java.util.Arrays;

/*20. Write a Java program to sort a numeric array and a string array.*/
public class W7q20 {

    public static void main(String[] args) {
        int[] numric={20,3,45,1,0,345};
        String[] sarray={"city","location","state","country","postcode"};

        System.out.println("Original Numeric Array: " + Arrays.toString(numric));
        Arrays.sort(numric);
        System.out.println("sorted Array: " + Arrays.toString(numric));

        System.out.println("Original String Array: " + Arrays.toString(sarray));
        Arrays.sort(sarray);
        System.out.println("Sorted String Array: " + Arrays.toString(sarray));

    }
}
