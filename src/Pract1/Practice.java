package Pract1;

public class Practice {

    /* public static void main(String[] args) {
        int[] array = {1, 4, 6, 9, 0, 14, 99, 21};
        System.out.println(getMin(array));
    }

    public static int getMin(int[] array) {
        int min = array[0];
        for (int elem : array) {
            if (elem < min) {
                min = elem;
            }
        }
        return min;
    } */


    /* public static void main(String[] args) {
        int[] array = {1, 2, 65, 3, 5, 7, 54, 12, 46, 4, 2};
        System.out.println("Индекс искомого элемента: " + find(array, 12));
    }

    public static int find(int[] array, int elem) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elem) {
                return i;
            }
        }
        return index;
    } */


    public static void main(String[] args) {
        int[] array = {1, 2, 5, 8, 12, 13, 20, 22, 24, 30, 32};
        System.out.println("Индекс искомого элемента " + findBinary(array, 30));
    }

    public static int findBinary(int[] array, int elem) {
        int index = -1;

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + ((high - low) / 2);
            if (array[mid] < elem) {
                low = mid + 1;
            } else if (array[mid] > elem) {
                high = mid - 1;
            } else if (array[mid] == elem) {
                index = mid;
                break;
            }
        }
        return index;
    }
}
