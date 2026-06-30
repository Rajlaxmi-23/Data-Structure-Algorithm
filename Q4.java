// Print the spiral order matrix as output for a given matrix of numbers. 
// Algorithm: (We are given a 2D matrix of n X m ).
/* 
1. We will need 4 variables:
a. row_start - initialized with 0.
b. row_end - initialized with n-1.
c. column_start - initialized with 0.
d. column_end - initialized with m-1.
2. First of all, we will traverse in the row row_start from column_startto column_end and we will increase the row_start with 1 as we have
traversed the starting row.
3. Then we will traverse in the column column_end from row_start to
row_end and decrease the column_end by 1.
4. Then we will traverse in the row row_end from column_end to
column_start and decrease the row_end by 1.
5. Then we will traverse in the column column_start from row_end to
row_start and increase the column_start by 1.
6. We will do the above steps from 2 to 5 until row_start <= row_end
and column_start <= column_end.
*/

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row");
        int n = sc.nextInt();
        System.out.println("enter coloum2");
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int row_start = 0;
        int row_end = n - 1;
        int column_start = 0;
        int column_end = m - 1;
        while (row_start <= row_end && column_start <= column_end) {
            for (int i = row_start; i < row_end; i++) {
                for (int j = column_start; j < column_end; j++) {
                    row_end--;
                }
            }

        }

    }
}