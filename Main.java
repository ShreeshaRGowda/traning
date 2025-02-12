import java.util.Arrays;

public class Main {
    public static void findNextGreater(int[] arr, int[] result, int index) {
        if (index == arr.length) return;
        result[index] = -1;
        for (int j = index + 1; j < arr.length; j++) {
            if (arr[j] > arr[index]) {
                result[index] = arr[j];
                break;
            }
        }
        findNextGreater(arr, result, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {6, 8, 0, 1, 3};
        int[] result = new int[arr.length];
        findNextGreater(arr, result, 0);
        System.out.println(Arrays.toString(result));
    }
}