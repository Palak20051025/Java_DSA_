package BinaryTree;

import java.util.Scanner;

public class BalancedBinaryTree {
    public static boolean isBalanced(Node root){
        return Height(root) != -1;
    }
    public static int Height(Node root){
        if(root == null){
            return 0;
        }

        int lh = Height(root.left);
        if(lh == -1){
            return -1;
        }
        int rh = Height(root.right);
        if(rh == -1){
            return -1;
        }

        int height = Math.abs(lh - rh);

        if(height > 1){
            return -1;
        }
        return Math.max(lh, rh)+1;
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

        System.out.println("The result is : ");
        if(isBalanced(root)){
            System.out.println("Tree is balanced");
        }
        else{
            System.out.println("Tree is not balanced");
        }

    }
}
