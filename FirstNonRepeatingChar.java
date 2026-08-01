import java.util.*;
public class FirstNonRepeatingChar {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i<str.length();i++){
            int count = 0;
            for(int j = 0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;

                }
                if(count== 1){
                    System.out.println("First non repeating character: " + str.charAt(i));
                    break;

                }
            }
        }
    }
    
}
