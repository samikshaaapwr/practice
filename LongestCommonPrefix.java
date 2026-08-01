import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[]arg){
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextLine();
        }
        String prefix = "";

        for(int i = 0; i<arr[0].length();i++){
            char current = arr[0].charAt(i);

            for(int j = 1; j<n;j++){

            if(i>=arr[j].length()|| arr[j].charAt(i) != current){
                System.out.print(prefix);

                return;
            }
        }

             prefix += current;

        }

        System.out.println(prefix);
    }
    
}
