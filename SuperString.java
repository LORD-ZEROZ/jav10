import java.util.Scanner;
public class SuperString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String word = sc.nextLine();
        char Char,charofword;
        int uppersum = 0;
        int lowersum = 0;
		int special_ch = 0;
        for(Char = 'A'; Char <= 'Z'; Char++){
            for(int i = 0; i < word.length(); i++){
                charofword = word.charAt(i);
                if(charofword == Char){
                    uppersum++;
                }
            }
        }for(Char = 'a'; Char <= 'z'; Char++){
            for(int i = 0; i < word.length(); i++){
                charofword = word.charAt(i);
                if(charofword == Char){
                    lowersum++;
                }
            }
        }
        for(int i = 0; i < word.length(); i++){
            charofword = word.charAt(i);
            if(!Character.isLetterOrDigit(charofword)){
                special_ch++;
            }
        }
        sc.close();
		if(uppersum==lowersum)
			System.out.println("It is a super string!");
		else{
        System.out.println("Number of uppercase letters: " + uppersum);
        System.out.println("Number of lowercase letters: " + lowersum);
		System.out.println("Number of special characters: " + special_ch);
		}
    }
}
