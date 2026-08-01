import java.util.*;
public class CountOccuranceofCharachter{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0;

        char ch = sc.next().charAt(0);

        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.print(count);
    }
}