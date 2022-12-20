public class DivideAndConquer {

    public static int[] findSecondLargest(int[] arr, int startIndex, int endIndex) {
        if (endIndex - startIndex == 1) {
            return new int[] { arr[startIndex], arr[startIndex] };
        }

        if (endIndex - startIndex == 2) {
            return new int[] {
                    Math.max(arr[startIndex], arr[startIndex + 1]),
                    Math.min(arr[startIndex], arr[startIndex + 1]) };
        }

        int[] leftSide = findSecondLargest(arr, startIndex, (startIndex + endIndex) / 2);
        int[] rightSide = findSecondLargest(arr, (startIndex + endIndex) / 2, endIndex);

        int largest = 0;
        int secondLargest = 0;

        if (leftSide[0] >= rightSide[0]) {
            largest = leftSide[0];

            if (leftSide[1] >= rightSide[0]) {
                secondLargest = leftSide[1];
            } else {
                secondLargest = rightSide[0];
            }
        } else {
            largest = rightSide[0];

            if (rightSide[1] >= leftSide[0]) {
                secondLargest = rightSide[1];
            } else {
                secondLargest = leftSide[0];
            }
        }

        return new int[] { largest, secondLargest };
    }
}
