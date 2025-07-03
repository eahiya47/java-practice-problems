package Class_Challenge;

import java.util.*;
class Node{
    String passengerName;
    int trainId;
    String pnr;
    Node next;
    
    Node(String passengerName, int trainId){
        this.passengerName = passengerName;
        this.trainId = trainId;
        next = null;
    }
}

class LinkedList{
    static Scanner sc = new Scanner(System.in);
    static Node head = null;
    
    public static void bookTicket(String passengerName, int trainId){
        Node node = new Node(passengerName, trainId);
        long num = 1000000000L + (long)(Math.random() * 9000000000L);
        node.pnr = String.valueOf(num);
        
        if(head == null){
            head = node;
            System.out.println("Ticket booked successfully!");
            System.out.println("\nName : " + passengerName + "\nPNR : " + node.pnr + "\nClick ENTER to continue.");
            sc.nextLine();
            return;
        }
        
        Node current = head;
        
        while(current.next != null){
            current = current.next;
        }
        current.next = node;
        System.out.println("Ticket booked successfully!");
        System.out.println("\nName : " + passengerName + "\nPNR : " + node.pnr + "\nClick ENTER to continue.");
        sc.nextLine();
        return;
    }
    
    public static void cancelTicket_by_PNR(String pnr){
        
        if(head == null){
            System.out.println("No reservations done!\nClick ENTER to continue.");
            sc.nextLine();
            return;
        }
        
        if(head.pnr.equals(pnr)){
            System.out.println("Ticket cancelled successfully!\nClick ENTER to continue.");
            sc.nextLine();
            return;
        }

        Node current = head;

        while(current.next != null && current.next.pnr.equals(pnr)){
            current = current.next;
        }

        if(current.next == null){
            System.out.println("PNR not found!\nClick ENTER to continue.");
            sc.nextLine();
            return;
        }

        current.next = current.next.next;
        System.out.println("Ticket cancelled successfully!\nClick ENTER to continue.");
        sc.nextLine();
        return;
    }

    public static void cancelTicket_by_Name(String name){

        int count  = 0;

        Node temp = head;
        while (temp != null) {
            if (temp.passengerName.equals(name)) {
                count++;
            }
            temp = temp.next;
        }

        if(count == 0){
            System.out.println("No reservations done!\nClick ENTER to continue.");
            sc.nextLine();
            return;
        }

        else if(count == 1)
        {
            if(head.passengerName.equals(name)){
                head = head.next;
                System.out.println("Ticket cancelled successfully!\nClick ENTER to continue.");
                sc.nextLine();
                return;
            }

            Node current = head;

            while(current.next != null && current.next.passengerName.equals(name)){
                current = current.next;
            }

            if(current.next == null){
                System.out.println("No registration in this name!\nClick ENTER to continue.");
                sc.nextLine();
                return;
            }

            current.next = current.next.next;
            System.out.println("Ticket cancelled successfully!\nClick ENTER to continue.");
            sc.nextLine();
            return;
        }else if(count > 1){
            System.out.print("Multiple passengers are found in this name, Please enter PNR to reduce the inconvenience! ");
            String pnr = sc.next();
            cancelTicket_by_PNR(pnr);
        }

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
            System.out.println("Train ID : " + current.trainId);
            System.out.println("PNR : " + current.pnr);
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
            System.out.println("\n1.Book Ticket \n2.Cancel Ticket by Name\n3.Cancel Ticket by PNR \n4.View Tickets \n5.Exit menu\n");
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
                    System.out.print("Enter the Passenger Name to cancel ticket : ");
                    String Pname = sc.next();

                    LinkedList.cancelTicket_by_Name(Pname);
                    break;

                case 3:
                    System.out.print("Enter the Passenger PNR to cancel ticket : ");
                    String pnr = sc.next();

                    LinkedList.cancelTicket_by_PNR(pnr);
                    break;

                case 4:
                    LinkedList.displayTickets();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    return;
                
                default:
                    System.out.println("Enter a valid choice!");
            }
        }
    }
}
