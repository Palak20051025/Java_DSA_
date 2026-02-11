package Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubstringWithoutRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();

        Set<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for(int right=0;right<s.length();right++){

            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right-left+1);

        }

        System.out.println("Length of longest substring without repeating characters is : " +maxLength);
    }
}
