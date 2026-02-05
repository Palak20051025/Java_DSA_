package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ElementWithSign {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int m = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[m];

        for(int i=0;i<m;i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int num : arr) {
            if (num >= 0) pos.add(num);
            else neg.add(num);
        }

        int min = Math.min(pos.size(), neg.size());
        int index = 0;

        for (int i = 0; i < min; i++) {
            arr[index++] = pos.get(i);
            arr[index++] = neg.get(i);
        }

        for (int i = min; i < pos.size(); i++) {
            arr[index++] = pos.get(i);
        }

        for (int i = min; i < neg.size(); i++) {
            arr[index++] = neg.get(i);
        }


        System.out.println("Arranged array is : " + Arrays.toString(arr));

    }
}
