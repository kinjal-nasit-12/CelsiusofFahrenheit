
import java.util.Scanner;

class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Temperature in Celsius:");

        try {
            double c = s.nextDouble();
            double f = convert(c);
            System.out.printf("Temperature in Fahrenheit: %.2f", f);
        } catch (Exception k) {
            System.out.println("Invalid input. enter temperature in Celsius");
        }
    }

    public static double convert(double c) {
        return (c * 9 / 5) + 32;
    }
}
