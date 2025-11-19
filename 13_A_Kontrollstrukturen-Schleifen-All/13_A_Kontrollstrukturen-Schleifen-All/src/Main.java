public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Use all of your knowledge for this tasks below. You are not restricted to certain loops anymore.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Calculate and print all the leap years from 0 to today's year.
        //
        //      A year is a leap year if it is divisible by 4.
        //      However, if the year is divisible by 100, then it is a leap year only when it is also divisible by 400.
        //
        //      Hint1: The divisibility by a particular number can be checked using the modulo operator.
        //
        //      Hint2: Check if your implementation is correct. For example; the Year 1900 is not a leap year.


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Print out all numbers from 1-10.
        //      If a number is divisible by three, then print "Fizz".
        //      If a number is divisible by five, then print "Buzz".
        //      If a number is divisible by three and five, print "FizzBuzz".

        int currentYear = java.time.Year.now().getValue();


        for (int year = 0; year <= currentYear; year += 4) {

            if (year % 100 != 0 || year % 400 == 0) {
                System.out.println(year);
            }
        }
        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");  // Challenge!
        // 03.  Given a number n (n > 2 && n < 100), write a program which tells if n is a prime.
        //      Example: n = 7 -> "It's a prime number!"
        //      Example: n = 10 -> "It's not a prime number!"

        int n = 1; // change this value from prime to not prime to test

        // Your code here

        if (n <= 1) {
            System.out.println("It's not a prime number!");

        } else {

            boolean isPrime = true;
            int i = 2;
            while (i * i <= n) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
                i++;
            }
            if (isPrime) System.out.println("It's a prime number!");
            else System.out.println("It's not a prime number!");
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");  // Challenge+!
        // 04. Print all prime numbers from 2-100.
        while (n <= 100) {
            boolean isPrime = true;
            int d = 2;
            while (d * d <= n) {
                if (n % d == 0) {
                    isPrime = false;
                    break;
                }
                d++;
            }
            if (isPrime) {
                System.out.println(n);
            }
            n++;
        }
    }
}