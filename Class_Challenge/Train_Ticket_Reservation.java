package Class_Challenge;

import java.util.*;
class Node{
    String passengerName;
    int passengerId;
    String seatNo;
    Node next;
    
    Node(String passengerName, int passengerId){
        this.passengerName = passengerName;
        this.passengerId = passengerId;
        next = null;
    }
}

class LinkedList{
    static Scanner sc = new Scanner(System.in);
    static Node head = null;
    
    public static void bookTicket(String passengerName, int passengerId){
        System.out.println("Ticket booked successfully for " + passengerName + "\nClick ENTER to continue.");
        sc.nextLine();
        Node node = new Node(passengerName, passengerId);
        
        if(head == null){
            head = node;
            return;
        }
        
        Node current = head;
        
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
        System.out.println("Ticket booked successfully for " + passengerName + "\nClick ENTER to continue.");
        sc.nextLine();
        return;
    }
    
    public static void cancelTicket_by_ID(int passengerId){
        
        if(head == null){
            System.out.println("No reservations done!\nClick ENTER to continue.");
            sc.nextLine();
            return;
        }
        
        if(head.passengerId == passengerId){
            System.out.println("Ticket cancelled successfully!\nClick ENTER to continue.");
            sc.nextLine();
            return;
        }

        Node current = head;

        while(current.next != null && current.next.passengerId != passengerId){
            current = current.next;
        }

        if(current.next == null){
            System.out.println("Passenger ID not found!\nClick ENTER to continue.");
            sc.nextLine();
            return;
        }

        current.next = current.next.next;
        System.out.println("Ticket cancelled successfully!\nClick ENTER to continue.");
        sc.nextLine();
        return;
    }

    public static void displayTickets(){
        
        if(head == null){
            System.out.println("No tickets reserved!\nClick ENTER to continue.");
            sc.next();
            return;
        }

        Node current = head;

        while(current != null){
            System.out.println("Passenger Name : " + current.passengerName);
            System.out.println("Passenger ID : " + current.passengerId);
            System.out.println();
            current = current.next;
            System.out.println("Click ENTER to continue.");
            sc.nextLine();
        }
    }
}

class Main{
    public static void main(String[] asdfs){
        Scanner sc = new Scanner(System.in);

        System.out.println("\nTrain Ticket Reserving Platform");
        
        while(true){
            System.out.println("\n1.Book Ticket \n2.Cancel Ticket \n3.View Tickets \n4.Exit menu\n");
            System.out.print("Enter your choice of service : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter Name : ");
                    String name = sc.nextLine();
                    System.out.print("Enter TrainId : ");
                    int id = sc.nextInt();
                    LinkedList.bookTicket(name, id);
                    break;
                
                case 2:
                    System.out.print("Enter the id to cancel ticket : ");
                    id = sc.nextInt();

                    LinkedList.cancelTicket_by_ID(id);
                    break;

                case 3:
                    LinkedList.displayTickets();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    return;
                
                default:
                    System.out.println("Enter a valid choice!");
            }
        }
    }
}
