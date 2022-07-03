import java.util.Arrays;
import java.util.Scanner;

public class FirstLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task one:");
        System.out.println(Arrays.toString(powerOfTwo(scanner)));


        int[] array = {10, 3, 3, 5, -9};
        System.out.println("Task two:");
        int[] new_array = new int[array.length];
        System.out.println("New array is " + Arrays.toString(reverseArray(array, new_array)));

        System.out.println("Task three:");
        printReverse(array);
        System.out.println();
        System.out.println("or ");
        reverseArray_two(array);

        System.out.println("Task four");
        int[] ar1 = {1, 4, 9, 12};
        int[] ar2 = {3, 5};
        System.out.println(Arrays.toString(merge(ar1, ar2)));
        System.out.println("or ");
        System.out.println(Arrays.toString(otherMerge(ar1, ar2)));


    }

    private static int[] powerOfTwo(Scanner scanner) {
        System.out.println("Please enter n - length of array");
        int n = scanner.nextInt();
        int[] array = new int[n];
        if (n >= 30) {
            return null;
        } else {
            for (int i = 0; i < n; i++) {
                array[i] = (int) Math.pow(2, i);
            }
        }
        return array;
    }

    private static int[] reverseArray(int[] ar1, int[] ar2) {
        for (int i = 0; i < ar1.length; i++) {
            ar2[i] = ar1[ar1.length - 1 - i];
        }
        return ar2;
    }

    private static void reverseArray_two(int[] ar) {
        for (int i = 0; i < ar.length / 2; i++) {
            int temp = ar[i];
            ar[i] = ar[ar.length - i - 1];
            ar[ar.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(ar));
    }

    private static void printReverse(int[] ar) {
        System.out.print("[");
        for (int i = ar.length - 1; i >= 0; i--) {
            System.out.print(" " + ar[i]);
        }
        System.out.print("]");
    }

    private static int[] merge(int[] ar1, int[] ar2) {
        int[] res = new int[ar1.length + ar2.length];
        System.arraycopy(ar1, 0, res, 0, ar1.length);
        System.arraycopy(ar2, 0, res, ar1.length, ar2.length);
        for (int i = 0; i < res.length; i++)
            for (int j = i + 1; j < res.length; j++) {
                if (res[i] >= res[j]) {
                    int tmp = res[i];
                    res[i] = res[j];
                    res[j] = tmp;
                }
            }
        return res;
    }

    public static int[] otherMerge(int[] ar1, int[] ar2) {
        int[] res = new int[ar1.length + ar2.length];
        int i = 0, j = 0, k = 0;
        while (i < ar1.length && j < ar2.length)
            res[k++] = ar1[i] < ar2[j] ? ar1[i++] : ar2[j++];
        while (i < ar1.length)
            res[k++] = ar1[i++];
        while (j < ar2.length)
            res[k++] = ar2[j++];
        return res;
    }
}
