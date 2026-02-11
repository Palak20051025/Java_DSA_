package BinarySearch;

import java.util.Scanner;

public class FirstAndLastOccurences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the element x : ");
        int x = sc.nextInt();

        int lb = LowerBound(arr, n, x);
        if(lb == n || arr[lb] != x){
            System.out.println("Index out of bound");
            return;
        }
        int ub = UpperBound(arr, n, x);
        System.out.println("Lower bound index : "+lb);
        System.out.println("Upper bound index : "+(ub-1));

    }

    public static int LowerBound(int arr[], int n, int x){
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
        return minIdx;
    }

    public static int UpperBound(int arr[], int n, int x){
        int left = 0;
        int right = n-1;
        int minIndx = n;

        while(left <= right){
            int mid = (left+right)/2 ;

            if(arr[mid] > x){
                minIndx = mid;
                right = mid-1;
            }
            else{
                left = mid+1;
            }
        }
        return minIndx;
    }
}
