import java.util.Scanner;

public class LetterNums_2 {

    public static String print(String str){

        String ans = "";
        String temp = "";
        int count = 0;
        String num = "";

        for(int i = 0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                if(num != ""){
                    count = Integer.parseInt(num);
                    for(int k = 1; k <= count; k++){
                        ans += temp;
                    }
                    temp = "";
                }
                temp += str.charAt(i);
                num = "";
            }else{
                num += str.charAt(i);
            }
        }

        if(num != ""){
            count = Integer.parseInt(num);
            for(int k = 1; k <= count; k++){
                ans += temp;
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

