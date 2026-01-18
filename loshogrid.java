import java.util.Scanner;
class loshogrid{
	public static void main(String[] args){
		int sumrw = 0;
		int sumcoln = 0;
		Scanner sc = new Scanner(System.in);
		int n = 3;
		int ar[][] = new int[n][n];
		for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				System.out.printf("Enter the element at row:%dcoln:%d: ",i,j);
				ar[i][j] = sc.nextInt();
			}
		}
		for(int i = 0; i<n; i++){
			sumrw = 0;
			sumcoln = 0;
			for(int j = 0; j<n; j++){
				sumrw += ar[j][i];
				sumcoln += ar[i][j];
			}
		}
		if(sumcoln == 15 && sumrw == 15){
			System.out.println("It is a losho grid");
			for(int i = 0; i<n; i++){
			for(int j = 0; j<n; j++){
				System.out.print(ar[i][j]+"\t");
			}
			System.out.println();
		}
		}
			else
				System.out.println("It is not a losho grid");
	}
}