import java.util.*;
public class ShortestWord {
    public static void main(String[]arg){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        String shortest = words[0];

        for(int i =0;i<words.length;i++){
            if(words[i].length()<shortest.length()){
                shortest= words[i];

            }
        }

        System.out.print(shortest);

    }
    
}
