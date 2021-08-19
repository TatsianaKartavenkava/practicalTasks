package typicalCodingTasks;

import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
        String myString = "Hello world ! I was born";
        String[] arrayStrings = myString.split("\\s");
        Arrays.stream(arrayStrings).forEach(System.out::println);
    }
}
