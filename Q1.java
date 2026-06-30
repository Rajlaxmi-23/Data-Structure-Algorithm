// Take an array from user.Search for a given number x and print the index at which it occurs.
import java.util.Scanner;
public class Q1 {
    public static void occNum(int arr[],int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("the position of this x element"+i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("enter element");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter which element you want to search:");
        int x=sc.nextInt();
        occNum(arr,x);
        sc.close();
            }

}