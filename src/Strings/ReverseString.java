package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string : ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();

        int i=0;
        int j=arr.length-1;

        while(i <= j){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println("Reversed String : " +new String(arr));
    }
}
