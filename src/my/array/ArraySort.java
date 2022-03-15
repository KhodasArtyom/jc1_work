package my.array;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] testArray = {1, 4, 7, 3, 4, 5, 9, 6, 3, 4};
        System.out.println(Arrays.toString(testArray));
        Arrays.sort(testArray);
        System.out.println(Arrays.toString(testArray));


        String[] testStrArray = {"b", "c", "d", "a", "aa", "ye", "bb"};
        Arrays.sort(testStrArray);
        System.out.println(Arrays.toString(testStrArray));

        for (String s : testStrArray) {

            System.out.print(s + " ");
        }
    }
}