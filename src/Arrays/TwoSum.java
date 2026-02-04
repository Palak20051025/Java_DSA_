package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the target sum : ");
        int k = sc.nextInt();

        Arrays.sort(arr);
        int i=0;
        int j = n-1;
        boolean result = false;
        int a = 0;
        int b = 0;

        while(i < j){
            int sum = arr[i] + arr[j];
            if(sum == k){
                a = arr[i];
                b = arr[j];
                result = true;
                break;
            }
            else if(sum < k){
                i++;
            }
            else{
                j--;
            }
        }

        if(result){
            System.out.println("We get the target sum from " +a+ " and " +b);
        }
        else{
            System.out.println("Did not get the target sum");
        }

    }
}
