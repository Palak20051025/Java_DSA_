package Arrays;

import java.util.Scanner;

public class MaximumConsecutiveOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        int max = 0;

        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 1){
                sum ++;
                max = Math.max(max, sum);
            }
            else{
                sum = 0;
            }
        }
        System.out.println("Maximum number of consecutive ones are : " +max);

    }
}
