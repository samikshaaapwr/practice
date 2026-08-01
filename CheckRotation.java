import java.util.*;
public class CheckRotation{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(str1.length()!=str2.length()){
            System.out.println("No");
            return;
        }

        String temp = str1 +str1;
        if(temp.contains(str2)){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}