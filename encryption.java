import java.util.Scanner;
public class encryption{
	static String org_text,encrypted_text;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		org_text = sc.nextLine();
		int length = org_text.length();
		int key = 6;
		encryptor(org_text,key,length);
		System.out.print("Enter the encrypted_text: ");
		encrypted_text = sc.nextLine();
		decryptor(encrypted_text,key,length);
		sc.close();
	}
	static void encryptor(String org_text,int key,int length){
		encrypted_text = "";
		for(int i = 0; i<length; i++){
			char code = org_text.charAt(i);
			code += key;
			encrypted_text += code;
		}
		System.out.println("The encrypted_text: "+encrypted_text);
	}
	static void decryptor(String encrypted_text,int key,int length){
		org_text = "";
		for(int i = 0; i<length; i++){
			char code = encrypted_text.charAt(i);
			code -= key;
			org_text += code;
		}
		System.out.println("The org_text: "+org_text);
	}
}