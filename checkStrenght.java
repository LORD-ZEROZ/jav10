import java.util.Scanner;
class checkStrenght{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int upper=0,lower=0,digits=0,special=0;
		System.out.print("Enter the string: ");
		String s = sc.nextLine();
		int len = s.length();
		for(int i = 0; i<len; i++){
			char char_word = s.charAt(i);
			if(Character.isUpperCase(char_word))
				upper++;
			if(Character.isLowerCase(char_word))
				lower++;
			if(!Character.isLetterOrDigit(char_word))
				special++;
			if(Character.isDigit(char_word))
				digits++;
		}
		if(upper<4 || lower<4 || digits<2 || special<2)
			System.out.println("It is a weak password");
		else
			System.out.println("It is a strong password");
	}
}