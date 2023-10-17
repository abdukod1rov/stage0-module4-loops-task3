package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        if (lastFibonacci <= 0) {
            System.out.println("Please provide a valid number greater than 0.");
            return;
        }

        int first = 0, second = 1;

        System.out.println("Fibonacci series up to the " + lastFibonacci + "th term:");

        for (int i = 1; i <= lastFibonacci; i++) {
            System.out.println(first);

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
