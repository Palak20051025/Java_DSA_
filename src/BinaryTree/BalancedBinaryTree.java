package BinaryTree;

import java.util.Scanner;

public class BalancedBinaryTree {
    public static boolean Balanced()
    public static int Height(Node root){
        if(root == null){
            return 0;
        }

        int lh = Height(root.left);
        int rh = Height(root.right);

        int height = Math.abs(lh - rh);

        if(height <= 1){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        boolean balance = Height(root);
        System.out.println("Tree is balanced or not : " +balance);

    }
}
