package BinarySearch;

import java.util.Scanner;

public class SingleElementInSortedArray {
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

        if(n == 1){
            System.out.println("Single element is : "+arr[0]);
        }

        if(arr[0] != arr[1]){
            System.out.println("Single element is : " +arr[0]);
        }

        if(arr[n-1] != arr[n-2]){
            System.out.println("Single element is : "+arr[n-1]);
        }

        while(left <= right){
            int mid = (left+right)/2 ;

            if(arr[mid] != arr[mid+1] && arr[mid] != arr[mid-1]){
                System.out.println("Single element is : " +arr[mid]);
            }
            if((mid % 2 == 1 && arr[mid-1] == arr[mid]) || (mid % 2 == 0 && arr[mid] == arr[mid+1])){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        System.out.println("Element not found");
    }
}
