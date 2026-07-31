import java.util.*;
public class StringCompression {
    public static void main(String[]arg){
        Scanner sc = new Scanner (System.in);
        String str = sc.nextLine();
        int count = 1;

        for(int i = 0; i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            } else {
                System.out.print(str.charAt(i));
                System.out.print(count);
                count = 1;

            }
        }
        System.out.print(str.charAt(str.length()-1));
        System.out.print(count);
    }
    
}
