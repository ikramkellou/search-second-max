import java.util.Random;
import java.util.Scanner;

public class Main {
    public static int[] generateArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100000000);
        }

        return array;
    }

    public static void displayResults(int result, int arraySize, long elapsedTime) {
        System.out.println("Second max element in the array: " + result);
        System.out.println(
                "Total execution time for an array with " + arraySize + " elements: " + elapsedTime + " nanosecond");
    }

    public static void divideAndConquer(int[] array) {
        long startTime = System.nanoTime();

        int[] result = DivideAndConquer.findSecondLargest(array, 0, array.length);

        long elapsedTime = System.nanoTime() - startTime;

        displayResults(result[1], array.length, elapsedTime);
    }

    public static void bruteForce(int[] array) {
        long startTime = System.nanoTime();

        int result = BruteForce.findSecondLargest(array);

        long elapsedTime = System.nanoTime() - startTime;

        displayResults(result, array.length, elapsedTime);
    }

    public static void tournament(int[] array) {
        long startTime = System.nanoTime();

        int[] maxArray = Tournament.findMax(0, array.length - 1, array);
        int[] secondMaxArray = Tournament.findMax(2, maxArray[0], maxArray);

        long elapsedTime = System.nanoTime() - startTime;

        displayResults(secondMaxArray[1], array.length, elapsedTime);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Choose the search approach: ");
        System.out.println("1 - Brute Force");
        System.out.println("2 - Divide and Conquer");
        System.out.println("3 - Tournament");

        // Get the chosen approach
        int method = input.nextInt();

        System.out.println("Enter the size of the array: ");

        // Get the size
        int size = input.nextInt();

        // Generate the array
        int[] array = generateArray(size);

        input.close();

        switch (method) {
            case 1:
                bruteForce(array);
                break;

            case 2:
                divideAndConquer(array);
                break;

            case 3:
                tournament(array);
                break;

            default:
                break;
        }
    }
}
