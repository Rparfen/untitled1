import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Student on 17.02.2018.
 */
public class Main {
    public static void main(String[] args) {
        int[] arr0 = {1, 2, 3, 4, 5, 6};
        int[] arr1 = {0, 0, 0, 0, 0, 0, 0, 0};

        System.out.println("arr0: " + Arrays.toString(arr0));
        System.out.println("arr1: " + Arrays.toString(arr1));

        System.arraycopy(arr0, 1, arr1, 2, 3);
        System.out.println("arr0: " + Arrays.toString(arr1));


    }
        /* int[] a1 = {6, 9, 3, 10, 8, 1, 7, 5, 2, 10, 4};
        sort(a1);
        System.out.println(Arrays.toString(a1));*/


    private static void revertArray() {
        int[] a1 = {6, 9, 3, 10, 8, 1, 7, 5, 2, 10, 4};
        /*for (int i = 0; i < a1.length / 2; i++) {
            int temp = a1[i];
            a1[i] = a1[a1.length - 1 - i];
            a1[a1.length - 1 - i] = temp;
            System.out.println(Arrays.toString(a1));*/


       /* sort(a1);
        System.out.println("a1 = " + a1);
*/
    }

    private static void sort(int[] a1) {
        for (int i = a1.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a1[j] > a1[j + 1]) {
                    int temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                }

            }

        }
    }
}

