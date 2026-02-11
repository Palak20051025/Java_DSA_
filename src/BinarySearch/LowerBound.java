package BinarySearch;

import java.util.Scanner;

public class LowerBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element x : ");
        int x = sc.nextInt();

        int left = 0;
        int right = n-1;
        int minIdx = n;

        while(left <= right){
            int mid = (left+right)/2 ;

            if(arr[mid] >= x){
                minIdx = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }

        if(minIdx < n) {
            System.out.println("Lower bound index: " + minIdx + " Element: " + arr[minIdx]);
        }
        else {
            System.out.println("No lower bound exists");
        }
    }
}
