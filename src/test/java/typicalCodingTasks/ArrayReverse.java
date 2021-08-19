package typicalCodingTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] myArray = {1,2,3,4,5,6,7,8,9,10};
        int size = myArray.length;

        System.out.println("Мой массив - первый вариант до разворота:" + Arrays.toString(myArray));

        for(int i = 0; i < size/2; i++) {
            int rev = myArray[i];
            myArray[i] = myArray[size - 1 - i];
            myArray[size - 1 - i] = rev;
        }
        System.out.println("Мой массив -  первый вариант после поворота:" + Arrays.toString(myArray));
        System.out.println("//////////////////////////////////////////////////////");

        //второй вариант
        List<Integer> myArray2 = new ArrayList<>();
        myArray2.add(1);
        myArray2.add(2);
        myArray2.add(3);
        myArray2.add(4);
        myArray2.add(5);
        myArray2.add(6);
        myArray2.add(7);
        myArray2.add(8);
        myArray2.add(9);
        myArray2.add(10);
        System.out.println("Второй вариант до разворота массив:" + myArray2);
        Collections.reverse(myArray2);
        System.out.println("Второй вариант после разворота массив:" + myArray2);
    }
}
