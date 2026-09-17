import java.util.*;
public class twosums {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        

        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();

        for(int i = 0; i<arr.length;i++){
            for(int j = arr.length-1;j>i;j--){
                if(arr[i]+arr[j]==target){
                    System.out.println(i +" "+j);

                }
            }
        }
}
}
