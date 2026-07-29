import java.util.*;
public class RemoveDuplicateCharchter {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result ="";

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(result.indexOf(ch)==-1){
                result = result + ch;
            }
        }
        
        System.out.print(result);
    }
    
}
