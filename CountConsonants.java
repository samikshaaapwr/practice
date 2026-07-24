import java.util.*;
public class CountConsonants {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        
        a = a.toLowerCase();
        int count = 0;

        for(int i = 0; i<a.length();i++){
            char ch = a.charAt(i);
            if(ch>='a' && ch<='z')
            {
                if(ch=='a'|| ch == 'e'||ch =='i'||ch=='o'||ch=='u')
                {

                }
                else
                    count++;
        
    }
}
System.out.print(count);
        
}
}
