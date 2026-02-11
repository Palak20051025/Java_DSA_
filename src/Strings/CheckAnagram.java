package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string 1 : ");
        String s1 = sc.nextLine();

        System.out.println("Enter the string 2 : ");
        String s2 = sc.nextLine();

        s1 = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s","").toLowerCase();

        if(s1.length() != s2.length()){
            System.out.println("Not an anagram");
        }

        char[] freq = new char[26];

        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }

        for(int count : freq){
            if(count != 0){
                System.out.println("Not an anagram");
                return;
            }
        }
        System.out.println("It is an anagram");

    }
}
