package Arrays;

import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of an array : ");
        int n = sc.nextInt();
        System.out.println("Enter the elements of an array : ");
        int arr[] = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int num = 0;

        for(int i=1;i<n;i++){
            if(count == 0){
                num = arr[i];
                count = 1;
            }
            else if(num == arr[i]){
                count++;
            }
            else{
                count--;
            }

        }

        int count1 = 0;
        for(int i=0;i<n;i++){
            if(arr[i] == num){
                count1++;
            }
        }

        if(count1 > n/2){
            System.out.println("Majority element is : " +num);
        }
        else{
            System.out.println("No majority element found");
        }

    }
}
