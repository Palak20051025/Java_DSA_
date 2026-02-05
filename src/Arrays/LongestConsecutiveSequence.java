package Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }

        int longest = 0;

        for(int i : set){
            if(!set.contains(i-1)){
                int count = 1;
                int num = i;
                while(set.contains(num+1)){
                    num++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        System.out.println("Longest consecutive subsequence is : " +longest);
    }
}
