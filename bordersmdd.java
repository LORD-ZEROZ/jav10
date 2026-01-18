import java.util.Scanner;
public class bordersmdd{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int bordersm = 0;
		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();
		int array[][] = new int[size][size];
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				System.out.print("Enter the element of array: ");
				array[i][j] = sc.nextInt();
			}
		}
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				if(i==0 || j==0 || i==(size-1) || j==(size-1))
					bordersm += array[i][j];
			}
		}
		System.out.print("The sum is:"+bordersm);
		
		sc.close();
	}
}