import java.util.Arrays;
import java.util.Random;

public class SelectionSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] number = new int[200_0000];
        for (int i = 0; i < number.length; i++) {
            number[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(number));
        long startTime=System.currentTimeMillis();
        selectionSort(number);
        long endTime=System.currentTimeMillis();
        System.out.println("_____________________________________________________________________________\n");
        System.out.println(Arrays.toString(number));
        System.out.println("The time taken for the sort is :"+ (endTime-startTime)+"ms");

    }

    private static void selectionSort(int[] number) {
        int lengthOfArrayNumber = number.length;

        for (int i = 0; i < lengthOfArrayNumber - 1; i++) {
            int minNumber = number[i];
            int indexOfMinNumber = i;
            for (int j = i+1 ; j<lengthOfArrayNumber;j++){
                if (number[j]<minNumber){
                    minNumber = number[j];
                    indexOfMinNumber = j;
                }
            }
            swap(number,i,indexOfMinNumber);
        }

    }

    private static void swap(int[] number, int a, int b) {

        int temp = number[a];
        number[a]= number[b];
        number[b]= temp;
        
    }
}
