package Arrays;

import java.util.Scanner;

public class SecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i] > largest){
                second = largest;
                largest = arr[i];
            }
            if(arr[i] < largest && arr[i] > second){
                second = arr[i];
            }

        }

        System.out.println("The second largest element of array is : "+second);
    }
}
