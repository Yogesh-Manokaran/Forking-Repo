package sorting;

import java.util.Arrays;

public class ElementsSortingAsc {
    public static void main(String[] args) {
        int[] numbers = { 5, 2, 8, 1, 9 };

        System.out.println("Original array: " + Arrays.toString(numbers));

        Arrays.sort(numbers);

        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));
    }
}

