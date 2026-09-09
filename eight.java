import java.util.*;
public class eight{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];

        for(int i = 0; i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int largest = arr[0];
        int secondlargest = arr[0];

        for(int i = 0; i<arr.length;i++){
            if(arr[i]>largest){
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i]>secondlargest){
                secondlargest = arr[i];
            }
        }
        System.out.println("Largest: " + largest);
        System.out.println("SecondLargest: " + secondlargest);
    }
}
