import java.util.*;
public class one{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int reverse = 0;
        int digit;

        while(a!=0){
            digit = a % 10;
            reverse = reverse * 10 + digit;
            a = a /10;

        }
        System.out.println(reverse);

    }
}
