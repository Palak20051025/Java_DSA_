package Arrays;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        int xor1 = 0;
        int xor2 = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            xor1 ^= i+1;
            xor2 ^= arr[i];
        }

        int xor3 = xor1 ^ xor2;

        System.out.println("Missing number is : " +xor3);


    }
}
