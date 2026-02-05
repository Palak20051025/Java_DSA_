package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int idx = -1;

        for(int i=0;i<n-1;i++){
            if(arr[i] < arr[i+1]){
                idx = i;
                break;
            }
        }

        if(idx == -1){
            reverse(arr, 0, n-1);
            System.out.println("Next permutation is : " +Arrays.toString(arr));
        }

        for(int i=n-1;i>idx;i--){
            if(arr[i] > arr[idx]){
                int temp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = temp;
                break;
            }
        }

        reverse(arr, idx+1, n-1);

        System.out.println("Next permutation for the array : " + Arrays.toString(arr));
    }

    public static void reverse(int[] arr, int start, int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
