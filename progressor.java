import java.util.concurrent.TimeUnit;
public class progressor {
   /* Original version 
    public static void main(String[] arg) {
        String anim= "|/-\\";
        for (int x =0 ; x <= 100 ; x++) {
            String data = "\r" + anim.charAt(x % anim.length()) + " " + x;
            System.out.write(data.getBytes());
            Thread.sleep(100);
        }
    } */
   // Modified version (myself)
   public static void animation(String s){
    int buffer = 100;
    String anime = "|\\/|";
    try {
     for(int i = 0; i<=100; i++){
        System.out.printf("\r%s....%%%d%s",s,i,anime.charAt(i % anime.length()));
        TimeUnit.MILLISECONDS.sleep(buffer);
    }   
    } catch (InterruptedException e) {
     Thread.currentThread().interrupt();
     System.out.println(s+"interrupted");
    }
   }
   public static void main(String[] args){
    animation("Progressing");
   }
}

