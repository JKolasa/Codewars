package kyu7;

/*
Find the number of divisors of a positive integer n.

Random tests go up to n = 500000.
Examples

divisors 4  = 3 -- 1, 2, 4
divisors 5  = 2 -- 1, 5
divisors 12 = 6 -- 1, 2, 3, 4, 6, 12
divisors 30 = 8 -- 1, 2, 3, 5, 6, 10, 15, 30

 */

public class FindDivisorsOfANumber {


    public static int numberOfDivisors(int n) {

        if(n <= 0){
            return 0;
        }

        if(n == 1){
            return 1;
        }

        int divisors = 0;

        for (int i = 1; i <= n; i++) {
            if(n % i == 0){
                divisors++;
            }
        }

        return divisors;
    }
}
