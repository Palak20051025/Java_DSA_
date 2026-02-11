package Strings;

import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of string array : ");
        int n = sc.nextInt();
        System.out.println("Enter the strings of array : ");
        String str[] = new String[n];

        for(int i=0;i<n;i++){
            System.out.print("String " + i+1 + " : ");
            str[i] = sc.nextLine();
            System.out.println();
        }

        if(str == null || str.length == 0){
            System.out.println("Void Array");
        }

        String prefix = str[0];

        for(int i=1;i<str.length;i++){
            while(!str[i].startsWith(prefix)){
                prefix = prefix.substring(0, prefix.length()-1);

                if(prefix.isEmpty()){
                    System.out.println("No common prefix");
                }
            }
        }

        System.out.println("Longest common prefix is : "+prefix);

    }
}
