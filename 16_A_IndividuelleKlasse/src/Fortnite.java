

public class Fortnite {

    public String skin = "Midas";
    public short health = 100;
    public short shield = 100;

    public boolean pumpShot;

    public Fortnite(String skin){
       this.skin = skin;

    }



    public Fortnite (boolean pumpShot){
        this.pumpShot = pumpShot;
    }

    public void pumpShotDamage(){
        if (pumpShot == true){
            this.shield -=50;
            System.out.println(shield + "shield");
            System.out.println(health + "health");
        } if (shield <= 0){
            this.health -=50;
            System.out.println(shield + "shield");
            System.out.println(health + "health");
        } else if (health <= 0) {
            System.out.println("Dead");
        }

        if (pumpShot == false){
            System.out.println(shield + "shield");
            System.out.println(health + "health");
        }
    }
}

