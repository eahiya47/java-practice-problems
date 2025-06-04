
import java.util.Scanner;

public class LetterNums {

    public static String print(String str){

        String ans = "";
        int count = 0;

        // for(int i = 0; i < str.length(); i++){
        //     if(Character.isDigit(str.charAt(i))){
        //         count = Integer.parseInt(String.valueOf(str.charAt(i)));
        //         for(int k = 1; k <= count; k++){
        //             ans += str.charAt(i-1);
        //         }
        //     }
        // }

        for(int i = 1; i < str.length(); i+=2){
            count = Integer.parseInt(String.valueOf(str.charAt(i)));
            for(int k = 1; k <= count; k++){
                ans += str.charAt(i-1);
            }
        }
    
        return ans;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String res = print(str);

        System.out.println(res);
        sc.close();
    }
}
