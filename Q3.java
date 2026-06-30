import java.util.Scanner;
public class Q3 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int row = sc.nextInt();
        System.out.println("enter coloum2");
        int coloum =sc.nextInt();
        int arr[][]= new int[row][coloum];
        for(int i = 0;i<row;i++){
            for(int j = 0; j < coloum; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i = 0;i<row;i++){
            for(int j = 0; j < coloum; j++){
                System.out.println(arr[i][j]);
            }
        }
        System.out.println("enter a element you search");
        int x = sc.nextInt();
        for(int i = 0;i<row;i++){
            for(int j = 0; j < coloum; j++){
                if(arr[i][j]==x){
                    System.out.println("position of row is"+i+" position of coloum is"+j);
                }
                else{
                    System.out.println("element is not found");
                }
            }
        }
        
        
    }

    
}