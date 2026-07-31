import java.util.*;
public class LongestWordSentence{
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String longest = words[0];

        for(int i = 1;i<words.length;i++){
            if(words[i].length()>longest.length()){
                longest = words[i];
            }

        }
        System.out.print("Longest Word: " + longest);
    }
}