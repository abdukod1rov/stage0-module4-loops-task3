package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int number) {
        // Convert the number to a string
        String numberAsString = "" + number;

        int sum = 0;

        // Iterate through each character in the string
        for (int i = 0; i < numberAsString.length(); i++) {
            // Convert the character to an integer and add to the sum
            int digit = Character.getNumericValue(numberAsString.charAt(i));
            sum += digit;
        }

        // Print the sum of digits
        System.out.println("Sum of digits of " + number + ": " + sum);
    }
}