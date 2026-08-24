import java.util.Scanner;

public class UnitConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ForceConverter force = new ForceConverter();
        PressureConverter pressure = new PressureConverter();
        EnergyConverter energy = new EnergyConverter();
        TemperatureConverter temp = new TemperatureConverter();
        LengthConverter length = new LengthConverter();
        MassConverter mass = new MassConverter();

        while (true) {
            System.out.println("\n=== Engineering Unit Conversion Tool ===");
            System.out.println("1. Force");
            System.out.println("2. Pressure");
            System.out.println("3. Energy");
            System.out.println("4. Temperature");
            System.out.println("5. Length");
            System.out.println("6. Mass");
            System.out.println("7. Exit");
            System.out.print("Choose a category: ");

            int choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Newtons: ");
                    double n = input.nextDouble();
                    System.out.println("Pounds-force: " + force.newtonsToPounds(n));
                    break;

                case 2:
                    System.out.print("Enter Pascals: ");
                    double pa = input.nextDouble();
                    System.out.println("PSI: " + pressure.pascalToPSI(pa));
                    break;

                case 3:
                    System.out.print("Enter Joules: ");
                    double j = input.nextDouble();
                    System.out.println("BTU: " + energy.joulesToBTU(j));
                    break;

                case 4:
                    System.out.print("Enter Celsius: ");
                    double c = input.nextDouble();
                    System.out.println("Fahrenheit: " + temp.celsiusToFahrenheit(c));
                    break;

                case 5:
                    System.out.print("Enter Meters: ");
                    double m = input.nextDouble();
                    System.out.println("Feet: " + length.metersToFeet(m));
                    break;

                case 6:
                    System.out.print("Enter Kilograms: ");
                    double kg = input.nextDouble();
                    System.out.println("Pounds: " + mass.kilogramsToPounds(kg));
                    break;

                case 7:
                    System.out.println("Goodbye!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
