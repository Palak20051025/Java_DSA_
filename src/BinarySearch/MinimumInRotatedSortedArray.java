package BinarySearch;

import java.util.Scanner;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int left = 0;
        int right = n-1;
        int ans = Integer.MAX_VALUE;

        while(left <= right){
            int mid = (left+right)/2 ;


            if(arr[left] <= arr[mid]){
                ans = Math.min(ans, arr[left]);
                left = mid + 1;
            }
            else{
                ans = Math.min(ans, arr[mid]);
                right = mid - 1;
            }
        }
        System.out.println("Minimum element in rotated sorted array is : " +ans);
    }
}
