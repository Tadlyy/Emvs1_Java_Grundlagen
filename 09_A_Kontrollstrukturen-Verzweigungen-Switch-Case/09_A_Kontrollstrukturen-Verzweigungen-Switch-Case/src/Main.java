import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 01");
        // 01. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a number between 1 and 7.
        //     If the number is a 1, then print out Monday.  2 = Tuesday, 3 = Wednesday and so on until 7 = Sunday.
        //     Print "Not a weekday!" if it's not a number between 1-7.

        Scanner userInput = new Scanner(System.in);

        System.out.println("Write a number between 1-7 ");
        byte dayNum = userInput.nextByte();

        System.out.print("Old: ");
        switch (dayNum) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a weekday!");
                break;
        }

        System.out.print("New: ");
        String dayName = switch (dayNum) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Not a weekday!";
        };
        System.out.println(dayName);



        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 02");
        // 02. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Ask a user for a Month (String). Based on the provided month, print out the corresponding season.
        //     Months: January, February, March, April, May, June, July, August, September, October, November, December
        //     Seasons: Winter, Spring, Summer, Autumn
        //     Example:  "January" -> "Winter"
        //     Example: "EMVs" -> "Not a month!";
        //     Write the old switch-statement so, that it only contains 4 breaks.

        System.out.println("Write a month ");
        String monthNorm = userInput.nextLine();

        System.out.print("Old: ");
        switch (monthNorm) {
            case "december":
            case "january":
            case "february":
                System.out.println("Winter");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("Summer");
                break;
            case "september":
            case "october":
            case "november":
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Not a month!");
                break;
        }

        System.out.print("New: ");
        String season = switch (monthNorm) {
            case "december", "january", "february" -> "Winter";
            case "march", "april", "may" -> "Spring";
            case "june", "july", "august" -> "Summer";
            case "september", "october", "november" -> "Autumn";
            default -> "Not a month!";
        };
        System.out.println(season);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 03");
        // 03. Solve this exercise with the help of both, the old switch-statement and the new switch expression.
        //     Create a program that takes a month number (1-12) and prints the number of days in that month.
        //     Assume it's not a leap year.

        System.out.print("Old: ");
        byte monthNum = userInput.nextByte();

        switch (monthNum) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 days");
                break;
            default:
                System.out.println("Invalid month number");
                break;
        }
        System.out.print("New: ");
        String days = switch (monthNum) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31 days";
            case 4, 6, 9, 11 -> "30 days";
            case 2 -> "28 days";
            default -> "Invalid month number";
        };
        System.out.println(days);




        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 04");
        // 04.  Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Create a basic role-playing game character class selector.
        //      Based on a number input, assign strength, agility, and intelligence values to a character.
        //      Example: "Select a class (1-Warrior, 2-Mage, 3-Rogue, 4-Cleric): "
        //      User Input: 2
        //      Output: "Mage (Strength: 3, Agility: 4, Intelligence: 9)"

        System.out.println("Pick a class: 1=Warrior 2=Mage 3=Rogue 4=Cleric");
        byte classChoice = userInput.nextByte();

        String character = switch (classChoice) {
            case 1 -> "Warrior (Strength: 9, Agility: 5, Intelligence: 2)";
            case 2 -> "Mage (Strength: 3, Agility: 4, Intelligence: 9)";
            case 3 -> "Rogue (Strength: 5, Agility: 9, Intelligence: 3)";
            case 4 -> "Cleric (Strength: 4, Agility: 3, Intelligence: 8)";
            default -> "Unknown class";
        };
        System.out.println(character);


        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 05");
        // 05.  Solve this exercise with whatever switch you feel more comfortable (new or old).
        //      You can use all you know so far to solve this.
        //      Ask the user to translate a digit (0-9) (userInput 1)
        //      in another language (1-german, 2-english, 3-japanese) (user input 2).

        //      Example:
        //      "Which digit do you want to translate?" -> 7
        //      "In which language do you want to translate your digit?" -> 3
        //      Output: nana

        //      Help for japanese Numbers:
        //      0: zero
        //      1: ichi
        //      2: ni
        //      3: san
        //      4: shi
        //      5: go
        //      6: roku
        //      7: nana
        //      8: hachi
        //      9: kyuu
        //      default: Mukō na sūchi

        System.out.println("Which digit do you want to translate?");
        byte digitTrans = userInput.nextByte();

        System.out.println("Wich langauge?: 1=German 2=English 3=japanese");
        byte languageChoise = userInput.nextByte();

        String number = switch (languageChoise){
            case 1 -> switch(digitTrans){
                case 0 -> "Null";
                case 1 -> "Eins";
                case 2 -> "Zwei";
                case 3 -> "Drei";
                case 4 -> "Vier";
                case 5 -> "Fünf";
                case 6 -> "Sechs";
                case 7 -> "Sieben";
                case 8 -> "Acht";
                case 9 -> "Neun";
                default -> "Ungültige Zahl";
            };
            case 2 -> switch(digitTrans){
                case 0 -> "Zero";
                case 1 -> "One";
                case 2 -> "Two";
                case 3 -> "Three";
                case 4 -> "Four";
                case 5 -> "Five";
                case 6 -> "Six";
                case 7 -> "Seven";
                case 8 -> "Eight";
                case 9 -> "Nine";
                default -> "Invalid number";
            };
            case 3 -> switch(digitTrans){
                case 0 -> "Zero";
                case 1 -> "ichi";
                case 2 -> "ni";
                case 3 -> "san";
                case 4 -> "shi";
                case 5 -> "go";
                case 6 -> "roku";
                case 7 -> "nana";
                case 8 -> "hachi";
                case 9 -> "kyuu";
                default -> "Mukō na sūchi";
            };
            default -> "Unknown language";
        };
        System.out.println(number);





        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Exercise 06");
        // 06.   Solve this exercise with whatever switch you feel more comfortable (new or old)
        //      Write a small calculator. A user types in two numbers and an operation ('addition', 'subtraction', 'division', 'multiplication').
        //      Calculate the correct answer and print it out.
        //      Print a warning when the user tries to divide by 0 (Example: 2/0 -> number two must not be 0!

        System.out.println("Choose: 1=addition 2=subtraction 3=division 4=multiplication");
        int mathChoose = userInput.nextInt();

        System.out.println("choose number one");
        int numberOne = userInput.nextInt();

        System.out.println("Choose number two");
        int numberTwo = userInput.nextInt();

        String result = switch (mathChoose){
        case 1 -> "Resultat:" + (numberOne + numberTwo);
        case 2 -> "Resultat:" + (numberOne - numberTwo);
        case 3 -> {
            if (numberTwo == 0) {
                yield "Error";
            }else{
                    yield "resultat:"+ (numberOne / numberTwo);
                }
            }
        case 4 -> "Resultat:"+ (numberOne * numberTwo);
        default -> "Unknown operator";
        };
        System.out.println(result);






        //--------------------------------------------------------------------------------------------------------------
        System.out.println("Optional exercises");
        // 01.  Try to come up with a program on your own and the tools you
        //    know so far. Try to implement user input.
    }
}

