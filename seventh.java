import java.util.*;
public class seventh{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int original = a;
        int count = 0;
        int digit = 0;
        int sum = 0;
        int temp = a;

        while(temp!=0){
            temp= temp/10;
            count++;
        }
        while(a!=0){
            digit = a% 10;
            sum = sum+(int)Math.pow(digit,count);
            a = a/10;
        }

        if(sum == original){
            System.out.println("Armstrong");
        } else {
            System.out.println("Not a Armstrong");
        }
    }
}