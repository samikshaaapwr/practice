import java.util.*;
public class smalles {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];

        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int smallest = arr[0];

        for(int i = 0; i<arr.length;i++){
            if(arr[i]<smallest){
                smallest = arr[i];
            } 
        }
        System.out.println(smallest);
    }
    
}
