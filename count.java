import java.util.*;
public class count {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr = new int[a];

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int counteven = 0;
        int countodd = 0;
        int result = 0;

        for(int i = 0; i<arr.length;i++){
            if(arr[i]%2==0){
                counteven++;
            } else {
                countodd++;
            }
        }

        System.out.println("Even: " + counteven);
        System.out.println("Odd: " + countodd);


    }
    
}
