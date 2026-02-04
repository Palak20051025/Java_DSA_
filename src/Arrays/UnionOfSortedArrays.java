package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class UnionOfSortedArrays {
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
        int k=0;
        int arr[] = new int[m+n];

        while(j<m && k<n){
            if(arr1[j] < arr2[k]){
                arr[i] = arr1[j];
                j++;
            }
            else{
                arr[i] = arr2[k];
                k++;
            }
            i++;
        }

        while(j<m){
            arr[i] = arr1[j];
            j++;
            i++;
        }

        while(k<n){
            arr[i] = arr2[k];
            k++;
            i++;
        }


        System.out.println("Union of two sorted arrays is : " + Arrays.toString(arr));
    }
}
