import java.util.Scanner;
public class perform {
    public void performance(int n){
        String ns = Integer.toString(n);
        int length = ns.length();
        int first_number = ns.charAt(0)-'0';
        int last_number = ns.charAt(length - 1)-'0';
        int product = first_number * last_number;
        System.out.println("Product of first and last digit: " + product);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		perform p = new perform();
        System.out.print("Enter the number: ");
		int number = sc.nextInt();
		p.performance(number);
    }
}