package typicalCodingTasks;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(findFactorial1(5));
        System.out.println(findFactorial2(5));
    }

    static int findFactorial1(int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

    static int findFactorial2(int n) {
        int result;
        if(n == 1) return 1;
        result = findFactorial2(n - 1) * n;
        return result;
    }
}



