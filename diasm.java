import java.util.Scanner;
public class diasm{
	public static void main(String[] args){
		int diasum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size = sc.nextInt();
		int array[][] = new int[size][size];
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.print("Enter the element:");
				array[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				if((i+j)==(size-1))
					diasum += array[i][j];
			}
		}
		System.out.println("The diagonal sum is: "+diasum);
		sc.close(); 
	}
}