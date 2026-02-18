package BinaryTree;

import java.util.Scanner;
import java.util.Stack;

public class IterativePostorder {
    public static void Postorder(Node root){
        if(root == null) {
            return;
        }
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while(!stack1.isEmpty()){
            Node current = stack1.pop();
            stack2.push(current);

            if(current.left != null){
                stack1.push(current.left);
            }

            if(current.right != null){
                stack1.push(current.right);
            }
        }

        while(!stack2.isEmpty()){
            System.out.print(stack2.pop().data + " ");
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
