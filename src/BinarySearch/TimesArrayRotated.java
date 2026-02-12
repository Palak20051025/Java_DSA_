package BinarySearch;

import java.util.Scanner;

public class TimesArrayRotated {
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
        int idx = -1;

        while(left <= right){
            int mid = (left+right)/2 ;

            if(arr[left] <= arr[right]){
                if(ans > arr[left]){
                    idx = left;
                    ans = arr[left];
                }
                break;
            }
            if(arr[left] <= arr[mid]){
                if(arr[left] < ans){
                    idx = left;
                    ans = arr[left];
                }
                left = mid + 1;
            }
            else{
                if(ans > arr[mid]){
                    idx = mid;
                    ans = arr[mid];
                }
                right = mid - 1;
            }
        }
        System.out.println("Array  is rotated : " +idx + " times");
    }
}
