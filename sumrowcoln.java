import java.util.Scanner;
public class sumrowcoln {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,j,n;
        System.out.print("ENter the size of the array: ");
        n = sc.nextInt();
        int a[][] = new int[n][n];
        for(i = 0; i<n; i++){
            for(j = 0; j<n; j++){
                System.out.printf("Enter the elements at row:%d column:%d : " ,(i+1),(j+1));
                a[i][j] = sc.nextInt();
            }
        }
        for(i = 0; i<n; i++){
            for(j = 0; j<n; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }        
        int sumrows =0 ,sumcoln = 0;
        for(i = 0; i<n; i++){
            for(j = 0; j<n; j++){
                sumrows += a[i][j];
                sumcoln += a[j][i];
            }
            System.out.printf("Sum of row %d is: %d\n",(i+1),sumrows);
            System.out.printf("Sum of column %d is: %d\n",(i+1),sumcoln);
            sumrows = 0;
            sumcoln = 0;
        }
        sc.close();
    }
}
