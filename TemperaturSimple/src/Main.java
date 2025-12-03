import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Temperature temp1 = new Temperature();
        temp1.celsius = 5;

        System.out.println(temp1.celsius);

        Temperature temp2 = new Temperature(56);
        System.out.println(temp2.celsius);


        temp2.printCelsius();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the temperature in C");
        Temperature temp3 = new Temperature(scanner.nextInt());
        System.out.println(temp3 + "°C");

        temp3.printCelsius();

        temp3.printHotOrColdCelsius();

        temp3.calculateCelsiusToFahrenheit();


        temp3.calculateCelsiusToKelvin();

    }
}