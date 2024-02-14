import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(10);
        }

        System.out.println(Arrays.toString(numbers));

        bubbleSort(numbers);
        System.out.println("_____________________________________________________________________\n");
        System.out.println(Arrays.toString(numbers));

    }

    private static void bubbleSort(int[] numbers) {

        boolean swapSomething = true;

        while (swapSomething) {
            swapSomething = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swapSomething = true;
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                }
            }

        }
    }
}
