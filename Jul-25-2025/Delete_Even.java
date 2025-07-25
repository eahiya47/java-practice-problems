import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}

public class Delete_Even {
    static Node head;

    public static void insertatEnd(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }
        current.next = node;
    }

    public static void delete(){
        if(head == null){
            return;
        }

        while (head != null && head.data % 2 == 0) {
        head = head.next;
        }
        Node curr = head;

        while(curr != null && curr.next != null){
            while(curr.next != null && curr.next.data % 2 == 0){
                curr.next = curr.next.next;
            }
            curr = curr.next;
        }
        
    }

    public static void display(){
        Node current = head;

        while(current != null){
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public static void main(String[] aegs){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < n; i++){
            insertatEnd(arr[i]);
        }
        delete();
        display();

        sc.close();
    }
}

