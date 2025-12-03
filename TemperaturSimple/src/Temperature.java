public class Temperature {

    public double celsius = 18.24;
    public double fahrenheit= celsius * 9 / 5 + 32;
    public double kelvin = celsius + 273.15;

    public Temperature(){
        System.out.println("hello");
    }

    public Temperature(int celsius){
        this.celsius = celsius;

    }

    public void printCelsius(){
        System.out.println(this.celsius + "°C");
    }

    public void printHotOrColdCelsius(){
       if (celsius <= 24 ){
           System.out.println("Its cold in here!");
       } else {
           System.out.println("Its not cold!");
       }
    }

    public void calculateCelsiusToFahrenheit(){
        System.out.println(fahrenheit + "f");
    }

    public void calculateCelsiusToKelvin(){
        System.out.println(kelvin + "k");
    }

}
