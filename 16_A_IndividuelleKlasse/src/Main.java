import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fortnite player1 = new Fortnite("IronMan");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Shoot? (True or false)");
        Fortnite pumpShot = new Fortnite(scanner.nextBoolean());

        pumpShot.pumpShotDamage();




    }
}