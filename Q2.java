//Find maximum and minimum from this array

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;//a value=-2345788 assign to largest ,10>-2345788,20>10
        int smallest = Integer.MAX_VALUE;

        int arr[] = new int[n];
        System.out.println("enter element");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            
        }
            System.out.println("the largest no "+largest+"\n the smallest no."+ smallest);
        sc.close();

    }
}
