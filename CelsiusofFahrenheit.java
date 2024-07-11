
import java.util.Scanner;

class CelsiusofFahrenheit {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Temperature in celsius:");
        float celsius = s.nextFloat();

        float fahrenheit = ((celsius * 9 / 5) + 32);
        System.out.println("Temperature in Fahrenheit:" + fahrenheit);
    }
}
