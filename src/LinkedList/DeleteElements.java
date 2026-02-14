package LinkedList;

import java.util.Scanner;

public class DeleteElements {
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

    private static Node DeleteHead(Node head){
        if(head == null){
            return null;
        }
        head = head.next;
        return head;
    }

    private static Node DeleteTail(Node head){
        if(head == null || head.next == null){
            return null;
        }
        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }

    private static Node DeleteKthNode(Node head, int k){
        if(head == null){
            return null;
        }

        if(k == 1){
            head = head.next;
            return head;
        }

        Node temp = head;

        int count = 1;
        while(temp != null && count < k-1){
            temp = temp.next;
            count++;
        }

        if(temp == null || temp.next == null){
            return head;
        }
        temp.next = temp.next.next;
        return head;
    }

    private static Node DeleteKthValue(Node head, int val){
        if(head == null){
            return null;
        }

        if(head.data == val){
            return head.next;
        }

        Node temp = head;
        Node prev = null;
        while(temp.data != val && temp != null){
            prev = temp;
            temp = temp.next;
        }

        if(temp == null){
            return head;
        }
        prev.next = temp.next;

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {7, 6, 9, 1, 2, 5, -9};
        System.out.println("Enter the position of element to delete : ");
        int n = sc.nextInt();

        Node head = Conversion(arr);
//        Node temp = DeleteHead(head);
//        Node temp = DeleteTail(head);
//        Node temp = DeleteKthNode(head, n);
        Node temp = DeleteKthValue(head, n);

        System.out.println("The new linked list is : ");
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
