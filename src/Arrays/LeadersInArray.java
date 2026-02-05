package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        int largest = Integer.MIN_VALUE;

        for(int i=n-1;i>=0;i--){
            if(arr[i] > largest){
                list.add(arr[i]);
                largest = arr[i];
            }
        }

        System.out.println("Leaders in the array are : " +list.toString());
    }
}
