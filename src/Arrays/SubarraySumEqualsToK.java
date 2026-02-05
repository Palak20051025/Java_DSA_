package Arrays;

import java.util.Scanner;

public class SubarraySumEqualsToK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
    }
}
