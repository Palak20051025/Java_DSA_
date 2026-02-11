package Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();

        s = s.toLowerCase();
        Set<Character> set = new HashSet<>();

        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }

        System.out.println("Duplicates removed : " +set.toString());
    }
}
