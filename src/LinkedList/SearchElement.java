package LinkedList;

import java.util.Scanner;

public class SearchElement {
    private static Node Conversion(int arr[]){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1;i<arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static boolean Search(Node head, int n){
        Node temp = head;
        while(temp != null){
            if(temp.data == n){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {7, -5, 6, 9, 1, -4, 2, 0, 5, -9};
        System.out.println("Enter the element to search : ");
        int n = sc.nextInt();

        Node head = Conversion(arr);
        boolean found = Search(head, n);

        if(found){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }

    }
}
