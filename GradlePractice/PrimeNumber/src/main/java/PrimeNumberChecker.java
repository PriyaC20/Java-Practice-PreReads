public class PrimeNumberChecker {

    private int number;

    public PrimeNumberChecker(int number) {
        this.number = number;
    }

    public Boolean check() {
        if (number < 2)
            return false;
        for (int divisor = 2; divisor <= number / 2; divisor++)
            if (number % divisor == 0)
                return false;
        return true;

    }

}
