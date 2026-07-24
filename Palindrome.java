import java.util.*;
public class Palindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String reverse = "";
        
        for(int i= a.length()-1;i>=0;i--){
            reverse = reverse + a.charAt(i);
        }
        if(a.equals(reverse)){
                System.out.print("Palindrome");
            } else {
                System.out.print("Not palindrome");
            }
    }
    
}
