public class RecursiveMethod {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialRecursive(5));
    }
    static int factorial(int value) {
        var res = 1;
        for(int i = 1; i <= value;i++) {
            res *= i;
        }
        return res;
    }
    static int factorialRecursive(int value) {
        if(value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
    // error StackOverflow
    static void loop(int value) {
        if(value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println(value);
            loop(value - 1);
        }
    }
}