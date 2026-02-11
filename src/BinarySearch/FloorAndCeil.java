package BinarySearch;

import java.util.Scanner;

public class FloorAndCeil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element x : ");
        int x = sc.nextInt();

        int floorElem = floor(arr, x);
        int ceilElem = ceil(arr, x);

        System.out.println("Floor element is : " +floorElem);
        System.out.println("Ceil element is : " +ceilElem);


    }

    public static int floor(int arr[], int x){
        int ans = -1;

        int left = 0;
        int right = arr.length-1;

        while(left <= right){
            int mid = (left + right)/2;

            if(arr[mid] <= x){
                ans = arr[mid];
                left = mid + 1;
            }
            else{
                right = mid-1;
            }
        }
        return ans;
    }

    public static int ceil(int arr[], int x){
        int ans = -1;

        int left = 0;
        int right =arr.length-1;

        while(left <= right){
            int mid = (left + right)/2;

            if(arr[mid] >= x){
                ans = arr[mid];
                right = mid - 1;
            }
            else{
                left = mid+1;
            }
        }
        return ans;
    }
}
