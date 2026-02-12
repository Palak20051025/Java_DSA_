package BinarySearch;

import java.util.Scanner;

public class SearchInRotatedArrayII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Element to be searched : ");
        int target = sc.nextInt();

        int left = 0;
        int right = n-1;

        while(left <= right){
            int mid = (left+right)/2 ;

            if(arr[mid] == target){
                System.out.println("Element found at index : "+mid);
                return;
            }

            if(arr[left] == arr[mid] && arr[mid] == arr[right]){
                left = left+1;
                right = right-1;
                continue;
            }

            if(arr[left] <= arr[mid]){
                if(arr[left] <= target && target <= arr[mid]){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
            else{
                if(arr[mid] <= target && target <= arr[right]){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
        }
        System.out.println("Element not found");
    }
}
