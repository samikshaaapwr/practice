import java.util.*;
public class movezeros {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[]arr = new int[n];

        for(int i = 0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int[]result = new int[n];
        int index = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i]!=0){
                result[index] = arr[i];
                index++;
            }
        }

        for(int i = 0; i<result.length;i++){
            System.out.print(result[i]+" ");
        }
 
        sc.close();

    }
    
}
