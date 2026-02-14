package LinkedList;

import java.util.Scanner;

public class InsertElements {
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

    private static Node InsertHead(Node head, int val){
        Node temp = new Node(val);
        temp.next = head;
        return temp;
    }

    private static Node InsertTail(Node head, int val){
        Node newNode = new Node(val);

        if(head == null){
            return newNode;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        return head;
    }

    private static Node InsertKthNode(Node head, int pos, int val){
        Node newNode = new Node(val);

        if(head == null){
            if(pos == 1){
                return newNode;
            }
            else{
                return null;
            }
        }

        if(pos == 1){
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        int count = 0;
        while(temp != null){
            count++;
            if(count == pos-1){
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

        return head;
    }

    private static Node InsertBeforeValue(Node head, int val, int pos){
        if(head == null){
            return null;
        }

        Node newNode = new Node(val);

        if(head.data == pos){
            newNode.next = head;
            return newNode;
        }

        Node temp = head;

        while(temp.next != null){

            if(temp.next.data == pos){
                newNode.next = temp.next;
                temp.next = newNode;
                break;
            }
            temp = temp.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {7, 6, 9, 1, 2};
        System.out.println("Enter the value to be inserted : ");
        int n = sc.nextInt();
//        System.out.println("Enter the position : ");
//        int pos = sc.nextInt();
        System.out.println("Value before which should be inserted : ");
        int val = sc.nextInt();

        Node head = Conversion(arr);
//        Node temp = InsertHead(head, n);
//        Node temp = InsertTail(head, n);
//        Node temp = InsertKthNode(head, pos, n);
        Node temp = InsertBeforeValue(head,n, val);

        System.out.println("The new linked list is : ");
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
}
