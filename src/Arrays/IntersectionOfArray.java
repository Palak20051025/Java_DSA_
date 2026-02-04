package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array 1 : ");
        int m = sc.nextInt();
        System.out.println("Enter the elements of an array 1 : ");
        int arr1[] = new int[m];

        for(int i=0;i<m;i++){
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the length of an array 2 : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array 2 : ");
        int arr2[] = new int[n];

        for(int i=0;i<n;i++){
            arr2[i] = sc.nextInt();
        }

        int i=0;
        int j=0;

        ArrayList<Integer> arr = new ArrayList<>();

        while(i<m && j<n){
            if(arr1[i] == arr2[j]){
                arr.add(arr1[i]);
                i++;
                j++;
            }
            else if(arr1[i] > arr2[j]){
                j++;
            }
            else{
                i++;
            }
        }


        System.out.println("Intersection of two sorted arrays is : " + arr.toString());
    }
}
