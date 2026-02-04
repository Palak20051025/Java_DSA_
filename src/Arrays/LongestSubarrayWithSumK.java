package Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class LongestSubarrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the value of sum : ");
        int k = sc.nextInt();

        int sum = 0;
        int len = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            sum += arr[i];

            if(sum == k){
                len = i + 1;
            }

            int rem = sum - k;
            if(map.containsKey(rem)){
                len = Math.max(len, i - map.get(rem));
            }

            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }

        System.out.println("Length of the longest consecutive subarray with sum k : " +len);

    }
}
