import java.util.Scanner;

public class EvenLength {

    public static String evenPart(String sample){
        String ans = "";
        String even = "";

        for(int i = 0; i < sample.length(); i++){
            if(sample.charAt(i) == ' '){
                if(even.length() % 2 == 0){
                    ans += even + " ";
                    even = "";
                }else{
                    even = "";
                }
                continue;
            }else{
                even += sample.charAt(i);
            }
        }
        if(even != ""){
            if(even.length() % 2 == 0){
                    ans += even + " ";
                    even = "";
            }else{
                even = "";
            }
        }

        return ans;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String result = evenPart(sentence);

        System.out.println(result);

        sc.close();
    }
}
