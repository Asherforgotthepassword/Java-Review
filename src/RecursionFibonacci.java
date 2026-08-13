public class RecursionFibonacci {
    public static void main(String[] args) {
        String bossMan = "Turner";
        System.out.printf("%s was here\n", bossMan);

        System.out.println(fibonacci(9));
    }

    public static int fibonacci(int n) {
        if (n < 2) return n;

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}