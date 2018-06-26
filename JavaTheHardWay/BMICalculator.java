import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, in, lbs;
    int ft;

    System.out.print("First, enter your height in feet only: ");
    ft = keyboard.nextInt();

    System.out.print("The rest of your height in inches: ");
    in = keyboard.nextDouble();

    System.out.print("Your weight in lbs: ");
    lbs = keyboard.nextDouble();

    // Calculate BMI using meter and kilogram conversions
    m = (in + (12 * ft)) / 39.3701;
    kg = 0.453592 * lbs;

    bmi = kg / (m * m);

    System.out.println("Your BMI is " + bmi);
  }
}
