public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        // Solve the following exercises __only__ with for-loops
        // Exercise 01-05 are similar to the while-exercises, just with a for instead of a while-loop.
        //--------------------------------------------------------------------------------------------------------------

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01.  Consider the following code:
        //      Do not run this code immediately!
        //
        //      for (int iteratorEx1 = 0; iteratorEx1 < 10; ) {
        //          System.out.println("iteratorEx1:" + iteratorEx1 + " ");
        //      }
        //
        //      Questions to consider:
        //      1. What would happen if you ran this code as is?
        //      2. Why does this behavior occur?
        //      3. How can you modify the code to achieve the desired output:
        //         i:0 i:1 i:2 i:3 i:4 i:5 i:6 i:7 i:8 i:9

        //      it would repeat the same thing all the time
        //      because there is no iterator++
        //      put an iretator++

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02.  Using for loops, print each task and its numbers to the console (all numbers inclusive):
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
        for (int num1 = 0; num1 <= 100;){
            System.out.println("Nummer "+num1);
            num1++;
        }


        System.out.println("02-02");
        for (int num2 = 42; num2 <= 100;){
            System.out.println("Nummer "+num2);
            num2++;
        }


        System.out.println("02-03");
        for (int num3 = 42; num3 <= 123;){
            System.out.println("Nummer "+num3);
            num3++;
        }


        System.out.println("02-04");
        for (int num4 = 0; num4 <= 10;){
            System.out.println("Nummer "+num4);
            num4++;
            num4++;
        }


        System.out.println("02-05");
        for (int num5 = 1; num5 <= 10;){
            System.out.println("Nummer "+num5);
            num5++;
            num5++;
        }


        System.out.println("02-06");
        for (int num6 = -10; num6 <= 20;){
            System.out.println("Nummer "+num6);
            num6++;
        }


        System.out.println("02-07");
        for (int num7 = 35; num7 >= 0;){
            System.out.println("Nummer "+num7);
            num7--;
        }


        System.out.println("02-08");
        for (int num8 = 15; num8 >= -20;){
            System.out.println("Nummer "+num8);
            num8--;
        }


        System.out.println("02-09");
        for (int num9 = 10; num9 >= -10;){
            System.out.println("Nummer "+num9);
            num9--;
            num9--;
        }


        System.out.println("02-10");
        for (int num10 = 9; num10 >= -10;){
            System.out.println("Nummer "+num10);
            num10--;
            num10--;
        }

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03.  Calculate the sum of all numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_03 = 0;

        // Your code here

        System.out.println(forSum_03); // Should be 5050

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Calculate the sum of all even numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_04 = 0;

        // Your code here

        System.out.println(forSum_04); // Should be 2550

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Calculate the sum of all odd numbers from 0-100 (both inclusive). Print it to the console.

        int forSum_05 = 0;

        // Your code here

        System.out.println(forSum_05); // Should be 2500

    }
}