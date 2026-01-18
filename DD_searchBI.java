import java.util.Scanner;
public static boolean check(int array[][], int target){
	for(int i=0; i<array.length; i++){
		for(int j=0; j<array[i].length; j++){
			if(array[i][j]==target)
				return true;
		}
	}
	return false;
}
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of the array: ");
	int size = sc.nextInt();
	int array[][]  = new int[size][size];
	for(int i=0; i<array.length; i++){
		for(int j=0; j<array[i].length; j++){
			System.out.print("Enter the elements of the array: ");
			array[i][j] = sc.nextInt();
		}
	}
	System.out.print("Enter target value: ");
	int target = sc.nextInt();
	sc.close();
	if(check(array, target))
	System.out.println("Search successful!");
	else
	System.out.println("search unsuccessful!");
}