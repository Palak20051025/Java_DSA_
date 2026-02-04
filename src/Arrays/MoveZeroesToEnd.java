package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i] != 0){
                arr[j+1] = arr[i];
                j++;
            }
        }

        for(int i=j+1;i<n;i++){
            arr[i] = 0;
        }

        System.out.println("Array after moving zeroes to end : " + Arrays.toString(arr));

    }
}
