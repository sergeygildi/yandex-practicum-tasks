package javacore.sprint4.OOP.task3;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[]{1, 3, 4, 6, 8};
        int[] array2 = new int[]{1, 2, 3, 8, 9};
        int[] resultArray = merge(array1, array2);

        for (int e : resultArray) {
            System.out.print(e + ", ");
        }
    }

    private static int[] merge(int[] leftArray, int[] rightArray) {

        int leftSize = leftArray.length;
        int rightSize = rightArray.length;
        int[] resultArray = new int[leftSize + rightSize];

        int left = 0;
        int right = 0;
        int index = 0;

        while (index < resultArray.length) {

            if (left >= leftSize) {
                resultArray[index] = rightArray[right];
                right++;
            }

            else if (right >= rightSize) {
                resultArray[index] = leftArray[right];
                left++;
            }

            else if (leftArray[left] <= rightArray[right]) {
                resultArray[index] = leftArray[left];
                left++;
            }
            else {
                resultArray[index] = rightArray[right];
                right++;
            }
            index++;
        }

        return resultArray;
    }

}
