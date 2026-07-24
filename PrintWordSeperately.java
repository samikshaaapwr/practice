import java.util.*;
public class PrintWordSeperately{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a =sc.nextLine();
        String print = "";

        for(int i = 0; i<a.length();i++){
            char ch = a.charAt(i);
            if(ch == ' '){
                System.out.println(print);
                print="";
            } else {
                print = print+ch;
            }
        }
        System.out.print(print);
    }
}