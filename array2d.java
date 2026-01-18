import java.util.*;
public class array2d {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int i,j;
    System.out.print("Enter the size of array: ");
    int n = sc.nextInt();
    int a[][] = new int[n][n];
    for(i = 0; i<a.length; i++){
        for(j = 0; j<a[i].length; j++){
            System.out.print("Enter the elements: ");
            a[i][j] = sc.nextInt();
        }
    }
    for(i = 0; i<a.length; i++){
        for(j = 0; j<a[i].length; j++){
            System.out.print("\n"+a[i][j]);
        }
 }
 sc.close();
 }
}