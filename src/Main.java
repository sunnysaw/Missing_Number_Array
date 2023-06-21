/*
Question : Given an array arr[] of size N-1 with integers in the range of [1, N], the task is to find the
           missing number from the first N integers. There are no duplicates in the list.
________________________________________________________________________________________________________________
Input1:
n = 8
arr[] = {1, 2, 4, 6, 3, 7, 8}
Output1:
5
Input2:
n = 5
arr[] = {1, 2, 3, 5}
Output2:
4
 */
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start,sizeOfArray,counting = 1;
        System.out.println("Enter the size of array : ");
        sizeOfArray = input.nextInt();
        System.out.println("Enter the element inside array :");
        int[] array = new int[sizeOfArray];
        for (start = 0; start < array.length; start++){
            array[start] = input.nextInt();
        }
        System.out.println("Printing the result :");
        Arrays.sort(array);
        for (start = 0; start < array.length; start++){
            if (counting < array[start]){
                System.out.println(counting++);
            }
            counting++;
        }
    }
}