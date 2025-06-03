
import java.util.*;

public class Pattern_1 {

    public void printPattern(int n){

        int i;
        int j;

        //first half
        for(i = 1; i <= n/2 + 1; i++){
            for(j = 1; j <= (n/2) + i; j++){
                if(j <= (n/2) + 1 - i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }

        //second half
        for(i = 1; i <= (n/2); i++){
            for(j = 1; j <= n - i; j++){
                if(j <= i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }


    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        Pattern_1 obj = new Pattern_1();
        obj.printPattern(n);

        sc.close();
    }
    
}
