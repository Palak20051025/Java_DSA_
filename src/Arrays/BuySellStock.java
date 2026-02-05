package Arrays;

import java.util.Scanner;

public class BuySellStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int min = arr[0];
        int profit = 0;

        for(int i=1;i<n;i++){
            int cost = arr[i] - min;
            profit = Math.max(profit, cost);
            min = Math.min(min, arr[i]);
        }

        System.out.println("Maximum profit gained is : " +profit);

    }
}
