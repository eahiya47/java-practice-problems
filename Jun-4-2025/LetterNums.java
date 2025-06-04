
import java.util.Scanner;

public class LetterNums {

    public static String print(String str){
// a2n4c5
        String ans = "";
        char[] ch = str.toCharArray();
        char[] nums = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        int count = 0;

        for(int i = 0; i < str.length(); i++){
            for(int j = 0; j < nums.length; j++){
                if(ch[i] == nums[j]){
                    count = Integer.parseInt(String.valueOf(ch[i]));
                    for(int k = 1; k <= count; k++){
                        // System.out.print(ch[i-1]);
                        ans += ch[i-1];
                    }
                }
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

    private static boolean isNum (char letter) {
        return letter >= '0' && letter <= '9';
    }
}
