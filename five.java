import java.util.*;
public class five {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int prime = 0;


        for(int i = 2; i<=5;i++){
            if(a%i==0){
                prime = 1;
                break;

            }
        }
        if(prime == 1){
            System.out.println("Not a Prime");
        } else {
            System.out.println("Prime");
        }

    } 
    
}
