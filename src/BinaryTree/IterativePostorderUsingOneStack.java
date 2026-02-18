package BinaryTree;

import java.util.Scanner;
import java.util.Stack;

public class IterativePostorderUsingOneStack {
    public static void Postorder(Node root){
        if(root == null) {
            return;
        }
        Stack<Node> stack = new Stack<>();

        Node current = root;
        Node lastVisited = null;

        while(current != null || !stack.isEmpty()) {

            if(current != null){
                stack.push(current);
                current = current.left;
            }
            else{
                Node peekNode = stack.peek();

                if(peekNode.right != null && lastVisited != peekNode.right){
                    current = peekNode.right;
                }
                else{
                    System.out.print(peekNode.data + " ");
                    lastVisited = stack.pop();
                }
            }
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
