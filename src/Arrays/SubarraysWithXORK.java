package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraysWithXORK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of K : ");
        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        int xor = 0;
        int count  = 0;

        map.put(0, 1);

        for(int i=0;i<n;i++){
            xor = xor ^ arr[i];
            int x = xor ^ k;
            count += map.getOrDefault(x, 0);
            map.put(xor, map.getOrDefault(xor, 0)+1);
        }

        System.out.println("Number of subarrays with XOR k are : " +count);
    }
}
