import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status;

        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 25) status = "Normal weight";
        else if (bmi < 30) status = "Overweight";
        else status = "Obese";

        return new String[] {
            String.format("%.2f", bmi),
            status
        };
    }

    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4]; // Height, Weight, BMI, Status

        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            String[] bmiInfo = calculateBMI(weight, height);

            result[i][0] = String.format("%.2f", height);      // Height in cm
            result[i][1] = String.format("%.2f", weight);      // Weight in kg
            result[i][2] = bmiInfo[0];                         // BMI
            result[i][3] = bmiInfo[1];                         // Status
        }

        return result;
    }

    public static void displayTable(String[][] results) {
        System.out.printf("%-10s %-10s %-10s %-20s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (int i = 0; i < results.length; i++) {
            System.out.printf("%-10s %-10s %-10s %-20s\n",
                    results[i][0], results[i][1], results[i][2], results[i][3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2]; 

        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d:\n", i + 1);
            System.out.print("  Weight (kg): ");
            data[i][0] = scanner.nextDouble();

            System.out.print("  Height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        String[][] results = processBMI(data);
        System.out.println("\nBMI Results:");
        displayTable(results);
    }
}