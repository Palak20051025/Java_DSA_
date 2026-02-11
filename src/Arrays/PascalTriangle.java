package Arrays;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row : ");
        int r = sc.nextInt();
        System.out.println("Enter the column : ");
        int c = sc.nextInt();

        //int PascalNum = PascalNumber(r - 1, c - 1);
        //System.out.println("The Pascal Number at the  place : " + PascalNum);

        PrintTheRow(c);
        PrintTriangle(r-1);

    }

    public static int PascalNumber(int row, int col) {
        if (col < 0 || col > row) {
            return 0;
        }
        col = Math.min(col, row - col);

        int res = 1;
        for (int i = 0; i < col; i++) {
            res = res * (row - i);
            res = res / (i + 1);
        }
        return res;
    }

    public static void PrintTheRow(int row){
        int ans = 1;
        System.out.print(ans);

        for(int i=1;i<row;i++){
            ans = ans * (row-i);
            ans = ans / (i);
            System.out.print(" " + ans);
        }
        System.out.println();
    }

    public static void PrintTriangle(int row){
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        for(int i=1;i<=row;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=1;j<=i;j++){
                temp.add(PascalNumber(i-1, j-1));
            }
            arr.add(temp);
        }

        System.out.println("Pascals Triangle : ");
        for(ArrayList<Integer> r : arr){
            System.out.println(r);
        }
    }
}
