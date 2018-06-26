import java.util.Scanner;

public class BMICategories {
	public static void main( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double kg, m, bmi, in, lbs;
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

		System.out.print( "BMI category: " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if ( bmi <= 16.0 ) {
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}
		if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40.0 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}
