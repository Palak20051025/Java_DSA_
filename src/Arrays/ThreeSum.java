package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ThreeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i=0;i<n-2;i++){
            if(i > 0 && arr[i] == arr[i-1]){
                continue;
            }

            int j = i+1;
            int k = n-1;

            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < 0){
                    j++;
                }
                else if(sum > 0){
                    k--;
                }
                else{
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);

                    list.add(temp);

                    j++;
                    k--;

                    while(j < k && arr[j] == arr[j - 1]) j++;
                    while(j < k && arr[k] == arr[k + 1]) k--;
                }
            }
        }

        System.out.println("The sets of three numbers having sum 0 : ");
        for(ArrayList<Integer> r : list){
            System.out.println(r);
        }

    }
}
