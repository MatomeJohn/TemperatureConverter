import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Temperature Converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 3) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter temperature: ");
            double temperature = scanner.nextDouble();

            switch (choice) {
                case 1:
                    double fahrenheit = (temperature * 9 / 5) + 32;
                    System.out.printf("%.2f°C is equal to %.2f°F\n\n", temperature, fahrenheit);
                    break;
                case 2:
                    double celsius = (temperature - 32) * 5 / 9;
                    System.out.printf("%.2f°F is equal to %.2f°C\n\n", temperature, celsius);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }

        scanner.close();
    }
}
