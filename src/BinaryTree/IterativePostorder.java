package BinaryTree;

import java.util.Scanner;

public class IterativePostorder {
    public static void Postorder(Node root){
        if(root == null){
            return;
        }


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

        System.out.println("Iterative inorder traversal : ");
        Postorder(root);
    }
}
