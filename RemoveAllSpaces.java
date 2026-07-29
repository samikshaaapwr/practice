import java.util.*;
public class RemoveAllSpaces {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String result = "";
        for(int i = 0; i<str.length();i++){
            if(str.charAt(i) != ' '){
                result = result + str.charAt(i);

            }
        }

            System.out.println(result);

    }    
}
