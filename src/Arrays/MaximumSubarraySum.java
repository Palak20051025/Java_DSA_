package Arrays;

import java.util.Scanner;

public class MaximumSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        int max = 0;

        for(int i=0;i<n;i++){
            sum += arr[i];

            if(sum < 0){
                sum = 0;
            }
            if(sum > max){
                max = sum;
            }
        }
    }
}
