import java.util.Random;

public class Main {
    public static int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100000000);
        }

        return array;
    }

    public static void main(String[] args) {
        int size = 100000000;
        int[] array = generateArray(size);

        long startTime = System.nanoTime();

        int[] result = DivideAndConquer.secondLargest(array, 0, array.length);

        long elapsedTime = System.nanoTime() - startTime;

        System.out.println("Largest element in the array: " + result[0]);
        System.out.println("Second largest element in the array: " + result[1]);
        System.out.println(
                "Total execution time for an array with " + size + " elements: " + elapsedTime + " nanosecond");

    }
}
