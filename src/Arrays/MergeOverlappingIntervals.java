package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MergeOverlappingIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[][] = new int[n][2];

        for(int i=0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        if(arr.length <= 1){
            System.out.println("Merged  interval : " +arr);
        }

        Arrays.sort(arr, (a,b) -> a[0] - b[0]);

        List<int[]> merge = new ArrayList<>();

        int[] current = arr[0];
        merge.add(current);

        for(int i=1;i<n;i++){
            int next[] = arr[i];

            if(current[1] >= next[0]){
                current[1] = Math.max(current[1], next[1]);
            }
            else{
                current = next;
                merge.add(current);
            }
        }

        System.out.println("Merged intervals are : ");
        for(int[] l : merge){
            System.out.println(Arrays.toString(l));
        }
    }
}
