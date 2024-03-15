//Java Programming Code to Reverse an Array

import java.util.Scanner;
import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lenght of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements: ");

        for(int i=0;i<n;i++){
            System.out.print("Enter the element: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array: "+ Arrays.toString(arr));

        //Reverse
        int start = 0;
        int end = n - 1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print("Revered array: "+ Arrays.toString(arr));
    }
}

