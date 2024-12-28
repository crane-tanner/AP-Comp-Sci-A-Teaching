import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double totalContributions = 0.0;
        double maxContribution = Double.MIN_VALUE; // ensures next contribution is greater
        double minContribution = Double.MAX_VALUE; // ensures next contribution is smaller
        int numContributions = 0;
                
        try {

                File file = new File("input.in");
                Scanner scanner = new Scanner(file);

            while (scanner.hasNextDouble() && totalContributions < 10000000) {
                double contribution = scanner.nextDouble();
                totalContributions += contribution;
                numContributions++;

                maxContribution = Math.max(maxContribution, contribution);
                minContribution = Math.min(minContribution, contribution);
            }

            double average = totalContributions / numContributions;

            BufferedWriter writer = new BufferedWriter(new FileWriter("results.out"));
            writer.write("It took " + numContributions + " contributions to reach the goal.\n");
            writer.write("Maximum contribution: $" + String.format("%.2f", maxContribution) + "\n");
            writer.write("Minimum contribution: $" + String.format("%.2f", minContribution) + "\n");
            writer.write("Average contribution: $" + String.format("%.2f", average) + "\n");
            writer.write("Total contributions: $" + String.format("%.2f", totalContributions) + "\n");
            writer.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading/writing file: " + e.getMessage());
        }
    }
}
