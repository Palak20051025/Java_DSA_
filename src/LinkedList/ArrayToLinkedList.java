package LinkedList;

import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data, Node node){
        this.data = data;
        this.next = node;
    }

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class ArrayToLinkedList {
    private static Node Conversion(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=0;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
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
        Node temp = head;
        System.out.println("Elements of the linked list : ");
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
