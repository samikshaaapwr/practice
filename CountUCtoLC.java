import java.util.*;
public class CountUCtoLC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int uppercase = 0;
        int lowercase = 0;

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='a' && ch<='z'){
                lowercase++;

            }else if(ch>='A' && ch<='Z'){
                uppercase++;
            }
        }
        System.out.println(lowercase + " Lowercase");
        System.out.println(uppercase + " Uppercase");

    }
    
}
