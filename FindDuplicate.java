import java.util.*;
public class FindDuplicate {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char []ch =str.toCharArray();

        int count = 0;

        for(int i = 0;i<ch.length;i++){
            for(int j = i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.println("Duplicate charachter: " + ch[j]);
                    count++;
                }
            }

        }
        System.out.println("duplicate charachter count:" + count);

    }
    
}
