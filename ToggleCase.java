import java.util.*;
public class ToggleCase {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String trasverse = "";

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
            } else {
                ch = Character.toUpperCase(ch);
            }
            trasverse = trasverse + ch;

        }
        System.out.println(trasverse);
    }
    
}
