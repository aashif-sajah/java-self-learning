public class BinarySort {
    public static void main(String[] args) {
        int[] numberArray = { 1, 2, 3, 4, 6, 8, 9, 11, 13, 16, 18 };
        System.out.println(binarySearch(numberArray, 0));

    }

    private static int binarySearch(int[] numbers, int numberToFind) {

        int low = 0;
        int high = numbers.length - 1;

        while (low <= high) {
            int middleIndex = (high + low) / 2;
            int middleNumber = numbers[middleIndex];

            if (middleNumber == numberToFind) {
                return middleIndex;
            }

            if (middleNumber < numberToFind) {
                low = middleIndex + 1;
            } else {

                high = middleIndex - 1;
            }

        }
        return -1;

    }
}
