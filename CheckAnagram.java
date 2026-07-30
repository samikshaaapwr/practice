import java.util.*;
public class CheckAnagram {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        if(a.length()!=b.length()){
            System.out.println("Not Anagram");
            return;
        }

        boolean anagram = true;

        for(int i = 0;i<a.length();i++){

            char ch= a.charAt(i);

            int count1 = 0;
            int count2 = 0;

                for(int j = 0;j<a.length();j++){
                    if(a.charAt(j)==ch){
                        count1++;
                    }
                }
                for(int j = 0;j<b.length();j++){
                    if(b.charAt(j)==ch){
                        count2++;
                    }
                }
            
                if(count1 != count2){
                        anagram = false;

                        break;
                    }

                
            }
            if(anagram){
                   System.out.println("Anagram");
                   
                } else{
                    System.out.println("Not Anagram");
                }

        }

    
    
}
