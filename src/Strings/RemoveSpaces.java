package Strings;

import java.util.Scanner;

public class RemoveSpaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();

        s = s.replaceAll("\\s", "");

        System.out.println("Removed spaces from string : " +s);
    }
}
