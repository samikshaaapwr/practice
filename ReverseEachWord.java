import java.util.*;
public class ReverseEachWord{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String word = "";

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch==' '){
                for(int j = word.length()-1;j>=0;j--){
                    System.out.print(word.charAt(j));
                } 
                System.out.print(" ");
                    word = "";
            
            }else {
                    word = word +ch;
                }
        }
        for(int j = word.length()-1;j>=0;j--){
                    System.out.print(word.charAt(j));
                }

    }
}