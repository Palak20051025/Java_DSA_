package Strings;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        s = s.replaceAll("\\s", "").toLowerCase();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else{
                consonants++;
            }
        }

        System.out.println("Number of vowels : " +vowels);
        System.out.println("Number of consonants : " +consonants);
    }
}
