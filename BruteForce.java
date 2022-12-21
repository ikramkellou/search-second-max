public class BruteForce {
    public static int findSecondLargest(int[] arr) {

        // The size of the array should be at least equal to 2.

        // Initialize the largest with the max between the first element and the second
        // element of the array.
        int largest = Math.max(arr[0], arr[1]);

        // Initialize the secondLargest with the min between the first element and the
        // second element of the array.
        int secondLargest = Math.min(arr[0], arr[1]);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            }
        }

        return secondLargest;
    }
}
