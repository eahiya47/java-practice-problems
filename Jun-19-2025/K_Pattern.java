import java.util.Scanner;

public class K_Pattern{

    public static void printPattern(int n){

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j <= i+1; j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        printPattern(n);
        sc.close();

    }
}