import java.util.Scanner;

public class Letters {

    public static String print(String str){

        String ans = "";
        int count = 1;

        for(int i = 0; i < str.length() - 1; i++){
            if(str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                ans += str.charAt(i);
                ans += count;
                count = 1;
            }
        }
        ans += str.charAt(str.length() - 1);
        ans += count;

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
