package BinarySearch;

import java.util.Scanner;

public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of array : ");
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target element : ");
        int target = sc.nextInt();

        int idx = -1;
        int i=0;
        int j=n-1;


        while(i<=j){
            int mid = (i+j)/2 ;

            if(arr[mid] == target){
                idx = mid;
                System.out.println("Element found at " +idx);
                return;
            }
            else if(arr[mid] < target){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        System.out.println("Element not found");
    }
}
