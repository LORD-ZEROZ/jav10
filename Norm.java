import java.util.Scanner;
class Norm{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int size = 4;
		double sumall  = 0.0;
		int array[][] = new int[size][size];
		for(int i=0; i<size; i++)
			for(int j=0; j<size; j++){
				System.out.print("Enter the element: ");
				array[i][j] = sc.nextInt();
			}
		for(int i=0; i<size; i++)
			for(int j=0; j<size; j++){
				sumall += Math.pow(array[i][j],2);
			}
		double norm = Math.sqrt(sumall);
		System.out.printf("Norm of sum:%.2f is %f",sumall,norm);
	}
}