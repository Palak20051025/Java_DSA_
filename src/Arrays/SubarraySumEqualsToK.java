package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class SubarraySumEqualsToK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k : ");
        int k = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;

        map.put(0, 1);

        for(int i=0;i<n;i++){
            prefixSum += arr[i];
            int remove = prefixSum - k;
            count += map.getOrDefault(remove, 0);
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) +1) ;
        }

        System.out.println("Maximum subarrays sum equal to k : " +count);
    }
}
