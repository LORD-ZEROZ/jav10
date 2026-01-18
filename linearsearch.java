public class linearsearch {
    public static void linearSearch(int[] array, int target){
        int n = array.length;
        for(int i = 0; i<n; i++){
            if (array[i] == target) {
                System.out.println("Element found at position: " + (i+1));
            }
        }
    }
    public static void linearSearch(String[] array, String target){
        int n = array.length;
        for(int i = 0; i<n; i++){
            if (array[i].equalsIgnoreCase(target)) {
                System.out.println("Element found at position: " + (i+1));
            }
        }
    }
    public static void linearSearch(double[] array, double target){
        int n = array.length;
        for(int i = 0; i<n; i++){
            if (array[i] == target) {
                System.out.println("Element found at position: " + (i+1));
            }
        }
    }
}
