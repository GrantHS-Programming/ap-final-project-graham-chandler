import java.util.Arrays;
import java.util.Random;
public class test {
    public static int[] generateNumbers(int size) {
        // Generate an array of 'size' random numbers
        Random random = new Random();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(1000000) + 1;
        }
        // Sort the array
        Arrays.sort(numbers);
        return numbers;
    }

    public static int binarySearch(int[] numbers, int target) {
        // Binary search to find the index of the target number
        int low = 0;
        int high = numbers.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (numbers[mid] == target) {
                return mid;
            } else if (numbers[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;  // Target not found
    }

    public static void main(String[] args) {
        // Generate numbers
        int[] numbers = generateNumbers(1000000);

        // Find the index of 600,000 using binary search
        int index = binarySearch(numbers, 600000);

        if (index != -1) {
            System.out.println("The number 600,000 is located at index: " + index);
        } else {
            System.out.println("The number 600,000 is not found in the array.");
        }
    }
}



