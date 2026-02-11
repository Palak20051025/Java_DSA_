package Strings;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();

        int i=0;
        int j=s.length()-1;
        boolean palin = true;

        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                palin = false;
                break;
            }
            else{
                i++;
                j--;
            }
        }

        if(palin){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
