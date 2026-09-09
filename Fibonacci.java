import java.util.*;
public class Fibonacci {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();

        for(int i = 1; i<=10;i++){
            System.out.println(first + " ");
            int next = first + second ;
            first = second;
            second = next;
        }

        
    }
    
}
