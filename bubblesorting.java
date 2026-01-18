import java.util.Scanner;
public class bubblesorting {
     public static void sorting(char array[]){
        int n = array.length;
        for(int i = 0; i<n-1; i++)
            for(int j = 0; j<n-i-1; j++)
                if(array[j]>array[j+1]){
                    char temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
    public static void sorting(int array[]){
        int n = array.length;
        for(int i = 0; i<n-1; i++)
            for(int j = 0; j<n-i-1; j++)
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
        public static void sorting(double array[]){
        int n = array.length;
        for(int i = 0; i<n-1; i++)
            for(int j = 0; j<n-i-1; j++)
                if(array[j]>array[j+1]){
                    double temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        char array[] = new char[n];
        for(int i = 0; i<array.length; i++){
            System.out.print("Enter element "+(i+1)+": ");
            array[i] = sc.next().charAt(0);
        }
        sc.close();
        sorting(array);
        for(int i = 0; i<array.length; i++){
            System.out.printf("Element %d: %c\n",(i+1),array[i]);
        }
    }
}
