import java.util.*;
public class RemoveAllVowels {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String result = "";
        for( int i = 0; i<str.length();i++){
            if(str.charAt(i)!='a'&& str.charAt(i)!='e'&& str.charAt(i)!='i' && str.charAt(i)!='o'&& str.charAt(i)!='u'){
                result = result+ str.charAt(i); 
            }
        }
        System.out.println(result);
    }
    
}
