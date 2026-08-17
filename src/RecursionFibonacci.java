public class RecursionFibonacci {
    public static void main(String[] args) {
        String bossMan = "Turner";
        System.out.printf("%s was here\n", bossMan);

        // print statement calls recursive function
        System.out.println(fibonacci(6));
    }

    public static int fibonacci(int n) {
        if (n < 2) return n; // base case

        return fibonacci(n - 1) + fibonacci(n - 2); // recursive case, calls itself twice in one return statement
    }
}
