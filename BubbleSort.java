import java.util.Arrays;
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++ ){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void main(String[] args) {

        int[][] arrays = {
            {45, 12, 89, 33, 67, 24, 78, 56, 90, 15},
            {5, 12, 19, 26, 33, 45, 58, 63, 77, 84},
            {90, 80, 70, 60, 50, 40, 30, 20, 10, 0},
            {-12, 56, -34, 23, 45, -67, 78, -89, 90, -15},
            {987, 123, 564, 776, 234, 879, 345, 112, 678, 901}
        };

        String[] arrayNames = {
            "Unsorted Numbers",
            "Already Sorted Numbers",
            "Reverse Sorted Numbers",
            "Random Negative and Positive Numbers",
            "Large Random Numbers"
        };

        for (int i = 0; i < arrays.length; i++) {
            System.out.println("\n" + arrayNames[i] + " Before Sorting: " + Arrays.toString(arrays[i]));
            bubbleSort(arrays[i]);
            System.out.println(arrayNames[i] + " After Sorting: " + Arrays.toString(arrays[i]));
        }       
    }  
}