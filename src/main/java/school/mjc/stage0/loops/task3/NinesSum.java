package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        if (lengthOfLastNumber <= 0) {
            System.out.println("Please provide a valid length greater than 0.");
            return;
        }

        long sum = 0;
        long currentNumber = 0;
        long multiplier = 1;

        // Build the last number consisting of "9" repeated lengthOfLastNumber times
        for (int i = 0; i < lengthOfLastNumber; i++) {
            currentNumber += 9 * multiplier;
            multiplier *= 10;
        }

        // Sum the series
        for (long i = 9; i <= currentNumber; i = i * 10 + 9) {
            sum += i;
        }

        System.out.println(sum);
    }
}
