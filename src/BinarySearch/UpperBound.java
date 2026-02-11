package BinarySearch;

import java.util.Scanner;

public class UpperBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter upper bound element x : ");
        int x = sc.nextInt();

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

        if(minIndx < n){
            System.out.println("Upper bound index : " +minIndx + " and element is : " +arr[minIndx]);
        }
        else{
            System.out.println("Upper bound index does not exist");
        }
    }
}
