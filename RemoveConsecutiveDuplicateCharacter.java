import java.util.*;
public class RemoveConsecutiveDuplicateCharacter {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        result += str.charAt(0);

        for(int i = 1; i<str.length();i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                result += str.charAt(i);
            }
        }
        System.out.println(result);


    }
    
}
