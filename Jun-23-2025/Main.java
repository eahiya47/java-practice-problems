import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int max = 0;

        for(int i =0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){
            if(arr[i] > arr[i+1]){
                max = arr[i];
            }
        }
        System.out.println(max);

        sc.close();
    }
} 