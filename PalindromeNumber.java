import java.util.*;
public class PalindromeNumber{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int original = a;
        int reverse = 0;

        while(a!=0){

            int digit = a % 2;
            reverse = reverse + digit ;
            a = a/ 10;

        }

        if(original == reverse){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}