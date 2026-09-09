import java.util.*;
public class reverse {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];

        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int reverse = 0;
        for(int j = arr.length - 1; j >= 0; j--){
    System.out.print(arr[j] + " ");
}
    
    }}
