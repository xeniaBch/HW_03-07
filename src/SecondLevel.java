import java.util.Arrays;
import java.util.Scanner;

public class SecondLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n");
        int n = scanner.nextInt();
        int[] array = new int [n];

        for (int i = 0; i < n; i++){
            array[i] = (int) (Math.random()*10);
        }

        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;

        }
        System.out.println(Arrays.toString(array));
    }
}