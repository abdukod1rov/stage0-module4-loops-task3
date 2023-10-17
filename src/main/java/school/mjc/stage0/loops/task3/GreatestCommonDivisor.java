package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    int gcd = 1;

    public void printGCD(int first, int second) {
        for (int i = 1; i <= first && i <= second; i++) {
            if (first % i == 0 && second % i == 0)
                //storing the variable i in the variable gcd
                gcd = i;
        }
        System.out.println(gcd);
    }
}
