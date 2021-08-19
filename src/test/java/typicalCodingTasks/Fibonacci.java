package typicalCodingTasks;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int[] array = new int[n];
        array[0] = 0;
        array[1] = 1;
        for(int i = 2; i < array.length; ++i){
            array[i] = array[i - 1] + array[i-2];
        }

        Arrays.stream(array).forEach(System.out::println);
    }
}
