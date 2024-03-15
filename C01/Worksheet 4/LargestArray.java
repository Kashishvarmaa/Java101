// Java Programming Code to Find Largest Element in Array

import java.util.Scanner;
public class LargestArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];
        System.out.println("Enter the elements in the array: ");

        for(int i=0;i<len;i++){
            System.out.print("Element is: ");
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        for(int i=0;i<len;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        System.out.print("The largest element is: " + largest);
    }
}


