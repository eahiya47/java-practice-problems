
import java.util.ArrayList;
import java.util.Scanner;

public class Vowels {

    public static ArrayList<String> print(String str){

        ArrayList<String> ans = new ArrayList<>();
        String lower = str.toLowerCase();
        String temp = "";
        char[] ch = lower.toCharArray();

        for(int i = 0; i < lower.length(); i++){
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'u' || ch[i] == 'o' || ch[i] == 'i'){
                if(temp != ""){
                    ans.add(temp);
                }
                temp = "";
                continue;
            }else{
                temp = temp + ch[i];
            }
        }

        if(temp != ""){
            ans.add(temp);
        }

        return ans;

    }
    

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        ArrayList<String> list = print(str);
        System.out.println(list);
        
        sc.close();

    }
}
