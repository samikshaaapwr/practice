import java.util.*;
public class CheckifOneStringisaSubstringofAnother {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String sub = sc.nextLine();

        if(str.contains(sub)){
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
    
}
