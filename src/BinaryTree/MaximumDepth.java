package BinaryTree;

import java.util.Scanner;

public class MaximumDepth {
    public static int MaxDepth(Node root){

        if(root == null){
            return 0;
        }

        int lh = MaxDepth(root.left);
        int rh = MaxDepth(root.right);

        return 1+Math.max(lh, rh);
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

        int depth = MaxDepth(root);
        System.out.println("Maximum depth of the binary tree is : " +depth);

    }
}
