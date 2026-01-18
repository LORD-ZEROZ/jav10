public class binarysearch {
    public static  void searching(int array[], int key) {
        int size = array.length;
        int left = 0;
        int right = size - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (array[mid] == key) {
                System.out.println("Element found at index: " + mid);
                return;
            }
            if (array[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println("Element not found in the array");
    }
}
