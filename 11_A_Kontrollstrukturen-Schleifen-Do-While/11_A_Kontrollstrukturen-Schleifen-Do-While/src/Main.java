import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Solve the following exercises __only__ with do-while-loops.
        // Separate exercises 'for' will follow.
        // Exercise 01-06 are similar to the while-exercises, just with a do-while instead of a while-loop.
        // Exercise 07 and 08 are new exercises.
        //--------------------------------------------------------------------------------------------------------------


//--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      int iteratorEx1 = 0;
        //
        //      do {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //      while (iteratorEx1 < 10);
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is?
        //      2. Why does this behavior occur?
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9
        //      4. Extra: What happens, if the initial value of "iteratorEx1" would be set to 100 instead of 0?
        //      it would always say the same
        //      because thw iterator doesnt go up
        //      you can ad an iteratot++
        //      then it would count to 99

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using do-while loops, print each task and its numbers to the console (all numbers inclusive):
        //      02-01. 0 to 100
        //      02-02. 42 to 100
        //      02-03. 42 to 123
        //      02-04. Even numbers (0, 2, 4, ...) from 0 to 10
        //      02-05. Odd numbers (1, 3, 5, ...) from 0 to 10
        //      02-06. -10 to 20
        //      02-07. 35 to 0 (descending)
        //      02-08. 15 to -20 (descending)
        //      02-09. Even numbers from 10 to -10 (descending)
        //      02-10. Odd numbers from 10 to -10 (descending)


        System.out.println("02-01");
        int num1 = 0;
        do {
            System.out.println("Nummer"+ num1);
            num1++;
        }while (num1 < 101);


        System.out.println("02-02");
        int num2 = 42;
        do {
            System.out.println("Nummer"+ num2);
            num2++;
        }while (num2 < 101);


        System.out.println("02-03");
        int num3 = 42;
        do {
            System.out.println("Nummer"+ num3);
            num3++;
        }while (num3 < 124);


        System.out.println("02-04");
        int num4 = 0;
        do {
            System.out.println("Nummer"+ num4);
            num4++;
            num4++;
        }while (num4 < 11);


        System.out.println("02-05");
        int num5 = 1;
        do {
            System.out.println("Nummer"+ num5);
            num5++;
            num5++;
        }while (num5 < 11);


        System.out.println("02-06");
        int num6 = -10;
        do {
            System.out.println("Nummer"+ num6);
            num6++;
        }while (num6 < 21);


        System.out.println("02-07");
        int num7 = 35;
        do {
            System.out.println("Nummer"+ num7);
            num7--;
        }while (num7 >= 0);


        System.out.println("02-08");
        int num8 = 10;
        do {
            System.out.println("Nummer"+ num8);
            num8--;
        }while (num8 >= -10);


        System.out.println("02-09");
        int num9 = 10;
        do {
            System.out.println("Nummer"+ num9);
            num9--;
            num9--;
        }while (num9 >= -10);

        System.out.println("02-10");
        int num10 = 9;
        do {
            System.out.println("Nummer"+ num10);
            num10--;
            num10--;
        }while (num10 >= -10);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_03 = 0;
        int numm = 0;

        // Your code here
        do {
            whileSum_03+=numm;
            System.out.println("Value number"+whileSum_03);
            numm++;
        }while (numm <= 100);
        System.out.println(whileSum_03); // Should be 5050


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_04 = 0;
        int numm2 = 0;
        // Your code here
        do {
            whileSum_04+=numm2;
            System.out.println("Value number"+whileSum_04);
            numm2++;
            numm2++;
        }while (numm2 <= 100);
        System.out.println(whileSum_04); // Should be 2550


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int whileSum_05 = 0;
        int numm3 = 1;
        // Your code here
        do {
            whileSum_05+=numm3;
            System.out.println("Value number"+whileSum_05);
            numm3++;
            numm3++;
        }while (numm3 <= 100);
        System.out.println(whileSum_05); // Should be 2500


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.  Generate random numbers between 0 and 100 (inclusive) until you get 22.
        //      Count and report how many attempts it took to generate 22.

        // Creating an object of type Random, calling it randomGenerator.
        // Check the import at the very beginning of this file. This import is needed to make this work
        Random randomGenerator = new Random();

        // Declaring an integer
        int randomNumber;

        // Setting the value of the integer to a random number between 0 (inclusive) and 101 (exclusive)
        randomNumber = randomGenerator.nextInt(101);
        long iterationSteps = 0;

        // Implement a do-while loop that:
        // 1. Generates a random number
        // 2. Increments the iteration count
        // 3. Stops when 22 is generated

        // Your code here
        do {
            randomNumber = randomGenerator.nextInt(101);
            System.out.println("Versuch"+iterationSteps);
            iterationSteps++;

        }while (randomNumber != 22);
        System.out.println("The program ran " + iterationSteps + " times until the number was found!");


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 07");
        // 07.  Generate random numbers between 0 and 100 (inclusive) until you get a match with the firstRandomNumber.
        //      Use a do-while loop, initializing the second random number inside the loop.
        //      Count and report how many attempts it took to generate a matching number.

        // We can use the random generator from exercise 06. So the following line is not needed:
        // Random randomGenerator = new Random();

        // Declaring and initializing the first random number
        int firstRandomNumber = randomGenerator.nextInt(101);

        // Declaring the second random number (will be initialized in the loop)
        int secondRandomNumber;

        // Reinitializing the iteration counter (Using the variable from exercise 06, resetting here)
        iterationSteps = 0;

        // Implement a do-while loop that:
        // 1. Generates a new random number for secondRandomNumber every single time
        // 2. Increments the iteration count
        // 3. Continues until firstRandomNumber equals secondRandomNumber

        // Your code here
        do {
            secondRandomNumber = randomGenerator.nextInt(101);
            System.out.println("Versuch" + iterationSteps + ": " + secondRandomNumber);
            iterationSteps++;
        } while (secondRandomNumber != firstRandomNumber);
        System.out.println("The program ran " + iterationSteps + " times until both random numbers matched.");
        System.out.println("The matching number was: " + firstRandomNumber);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 08");
        // 08.  Generate a random number between 0 and 10 (inclusive).
        //      Use a do-while loop to repeatedly ask the user to guess the number.
        //      Continue asking until the user correctly guesses the random number.
        //      Once guessed correctly, congratulate the user and reveal the number.

        // We can use the random generator from exercise 06/07. So the following line is not needed:
        // Random randomGenerator = new Random();

        // Creating a scanner object to handle user input
        Scanner input = new Scanner(System.in);

        // Generating a random number between 0 (inclusive) and 11 (exclusive)
        int rndNumberToGuess = randomGenerator.nextInt(11);

        // Declaring the variable for the user's guess
        int guessedNumber;

        // Implement a do-while loop that:
        // 1. Asks the user to guess the number
        // 2. Reads the user's input
        // 3. Continues until the guessed number matches the random number

        // Your code here
        do {
            System.out.print("Guess a number between 0 and 10: ");
            guessedNumber = input.nextInt();

            if (guessedNumber != rndNumberToGuess) {
                System.out.println("Nope, try again!");
            }
        } while (guessedNumber != rndNumberToGuess);

        System.out.println("Congratulations! You've guessed the correct number: " + rndNumberToGuess);

    }
}