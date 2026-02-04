package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class RotateArrayByKplaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of K : ");
        int k = sc.nextInt();

        k = k % n;

        Reverse(arr, 0, n-k-1);
        Reverse(arr, n-k, n-1);
        Reverse(arr, 0, n-1);

        System.out.println("Array rotated by K places : " +Arrays.toString(arr));

    }

    public static void Reverse(int arr[], int start, int end){
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
