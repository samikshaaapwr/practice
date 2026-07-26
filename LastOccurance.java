import java.util.*;
public class LastOccurance {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);

        int index = -1;

        for(int i = str.length()-1;i>=0;i--){
            if(str.charAt(i)==ch){
                index = i;
                break;

            }
        }
        System.out.print(index);
    }
    
}
