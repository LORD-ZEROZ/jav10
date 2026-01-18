import java.util.Scanner;
public class decryptICSE{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the id: ");
		String s = sc.nextLine();
		String class_no,year,centre_no,index_no;
		int len = s.length();
		if(s.charAt(0)=='1')
			class_no = "10";
		else 
			class_no = "12";
		year = s.substring(1,3);
		centre_no = s.substring(3,7);
		index_no = s.substring(8);
		System.out.println("Class: "+class_no);
		System.out.println("Year: "+year);
		System.out.println("Centre_No: "+centre_no);
		System.out.println("Index_No: "+index_no);
	}
}