package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MajorityElement2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        int max = (int)Math.floor(n/3);

        for(int i=0;i<n;i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);

            if(map.get(arr[i]) == max){
                list.add(arr[i]);
            }
        }
        System.out.println("Majority elements are : " +list.toString());

    }
}
