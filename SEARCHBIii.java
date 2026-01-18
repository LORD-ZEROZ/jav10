import java.util.Scanner;
public class SEARCHBIii{
	public static boolean check(char array[], char target){
		int max = array.length-1;
		int min = 0;
		while(min<=max){
			int mid = min + (max-min)/2;
			if(array[mid]==target)
				return true;
			else if(target<array[mid])
				max = mid-1;
			else if(target>array[mid])
				min = mid+1;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char array[] = {'A','H','N','P','S','U','W','Y','Z','b','d'};
		System.out.print("Enter the target: ");
		char target = sc.next().charAt(0);
		sc.close();
		if(check(array, target))
			System.out.println("Search Succesful");
		else
			System.out.println("Scorch is not successful");
	}
}