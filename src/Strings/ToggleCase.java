package Strings;

import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();

        char[] arr = s.toCharArray();

        for(int i=0;i<arr.length;i++){

            if(arr[i] >= 'a' && arr[i] <= 'z'){
                arr[i] = (char)(arr[i] - 32);
            }
            else if(arr[i] >= 'A' && arr[i] <= 'Z'){
                arr[i] = (char)(arr[i] + 32);
            }
        }

        System.out.println("Toggled string : " +new String(arr));
    }
}
