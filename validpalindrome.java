import java.util.*;
public class validpalindrome{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = "";

            for(int j = str.length()-1;j>=0;j--){
                reverse = reverse + str.charAt(j);
            }

            if(str.equals(reverse)){
                System.out.println("Palindrome");
            } else {
                System.out.println("Not a Palindrome");
            }
        }
}