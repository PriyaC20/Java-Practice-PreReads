public class Factorial {
    private int num;

    public Factorial(int num) {
        this.num = num;
    }

    public int performFactorial() {
        int fact = 1;
        if( num < 0)
            throw new ArithmeticException("Factorial of negative integer is undefined");
        for (int i = 2; i <= num ; i++) {
            fact *= i;
        }
        return fact;
    }
}
