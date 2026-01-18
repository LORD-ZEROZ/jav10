import java.util.Scanner;
class displayOrder{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("This is a displayOrder");
		int size = 100;
		int array[] = new int[size];
		for(int i= 0; i < size; i++){
			System.out.print("Enter the elements: ");
			array[i] = sc.nextInt();
		}
		int below_60= 0, btw60_80= 0, btw80_90= 0, above_90= 0;
		for(int i= 0; i < size; i++){
			if(array[i]<60)
				below_60++;
			else if(array[i]>=60&&array[i]<80)
				btw60_80++;
			else if(array[i]>=80 && array[i]<90)
				btw80_90++;
			else 
				above_90++;
		}
		System.out.println("Range \t No. Of Students");
		System.out.println("Above90 \t"+above_90);
		System.out.println("80-90 \t"+btw80_90);
		System.out.println("60-80 \t"+btw60_80);
		System.out.println("Below60 \t"+below_60);
	}
}