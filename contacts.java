import java.util.Scanner;
public class contacts extends progressor {
    Scanner sc = new Scanner(System.in);
    int i;
    String names[];
    int contacts[];
    public void input(){
        System.out.print("Enter the number of contacts: ");
        int  n = Integer.parseInt(sc.nextLine());
        names = new String[n];
        contacts = new int[n];
        for(i = 0; i<n; i++){
            System.out.printf("Enter the name of the contact %d: ",(i+1));
            names[i] = sc.nextLine();
            System.out.printf("Enter the contact of %s: ",names[i]);
            contacts[i] = Integer.parseInt(sc.nextLine());
        }
    }
    public void search(){
        System.out.print("Enter the name of the contact you want: ");
        String search = sc.nextLine();
        boolean found = false;
        for(i = 0; i<names.length; i++){
            if (search.equalsIgnoreCase(names[i])) {
                found = true;
                break;
            }
        }
        progressor.animation("Finding");
        if (found) {
            System.out.printf("\nThe contact has been found!\n");
            System.out.printf("The name is: %s and contact: %d",names[i],contacts[i]);
        }
        else
        System.out.println("There exists no such contact");
        sc.close();
    }
    public static void main(String[] args){
        contacts obContacts = new contacts();
        obContacts.input();
        obContacts.search();
    }
}
