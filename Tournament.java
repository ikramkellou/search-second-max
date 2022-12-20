public class Tournament {
    public static int[] findMax(int startIndex, int endIndex, int[] array) {
        // Base case: if startIndex = endIndex, return an array with a single element
        if (startIndex == endIndex) {
            int[] singleElemArray = new int[array.length];
            singleElemArray[0] = 1;
            singleElemArray[1] = array[startIndex];
            return singleElemArray;
        }

        // Recursive case: compare the max of the two halves of the array
        int[] leftSide = findMax(startIndex, (startIndex + endIndex) / 2, array);
        int[] rightSide = findMax(((startIndex + endIndex) / 2) + 1, endIndex, array);

        if (leftSide[1] > rightSide[1]) {
            int k = leftSide[0] + 1;
            leftSide[0] = k;
            leftSide[k] = rightSide[1];
            return leftSide;
        } else {
            int k = rightSide[0] + 1;
            rightSide[0] = k;
            rightSide[k] = leftSide[1];
            return rightSide;
        }
    }
}
