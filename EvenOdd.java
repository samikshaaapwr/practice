import java.util.*;
public class EvenOdd {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int result;
        result = a%2;

        if (result == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        
    }
    
}
