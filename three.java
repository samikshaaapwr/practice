import java.util.*;
public class three {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int b;

        while(a!=0){
            b = a% 10;
            sum = sum + b;
            a = a/ 10;
            
        }
        System.out.println(sum);
    }
    
}
