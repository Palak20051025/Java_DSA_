package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            set.add(arr[i]);
        }

        System.out.println("Array after removing duplicate elements : " +set.toString());

    }
}
