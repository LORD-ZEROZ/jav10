import java.util.Scanner;
class Cloudstorage{
		int acno,space;
		double bill;
	Cloudstorage(){
		acno = 0;
		space = 0;
		bill = 0.0;
	}
	void accept(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the account number: ");
		acno = sc.nextInt();
		System.out.print("Enter the storage required: ");
		space = sc.nextInt(); 
		sc.close();
	}
	void calculate(){
		if(space<=15)
			bill = 15*space;
		else if(space<=30)
			bill = 15*15 + (space-15)*13;
		else
			bill = 15*15 + 15*13 + (space-30)*11;
	}
	void display(){
		System.out.println("The account number is: "+acno);
		System.out.println("The cloud space is: "+space);
		System.out.println("The bill to paid is: $"+bill);
	}
	public static void main(String[] args){
		Cloudstorage obj = new Cloudstorage();
		obj.accept();
		obj.calculate();
		obj.display();
	}
}
	