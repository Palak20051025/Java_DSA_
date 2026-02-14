package LinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node node;

    Node(int data, Node node){
        this.data = data;
        this.node = node;
    }

    Node(int data){
        this.data = data;
        this.node = null;
    }
}

public class ArrayToLinkedList {
    private static Node Conversion(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=0;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.node = temp;
            mover = temp;
        }
        return head;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Node head = Conversion(arr);
        System.out.println("Head of the linked list : ");
        System.out.println(head.data);
    }
}
