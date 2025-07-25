import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
}
class Linked_List_Insertion{
    static Node head;

    public static void insertatBeginning(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
}

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
            if(arr[i] % 2 == 0){
                insertatEnd(arr[i]);
            }else{
                insertatBeginning(arr[i]);
            }
        }
        display();

        sc.close();
    }
}