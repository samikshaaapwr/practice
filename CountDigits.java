import java.util.*;
public class CountDigits {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;

        while(a != 0){
            count++;

            a = a/10;
        }

        System.out.println(count);
    }
    
}
