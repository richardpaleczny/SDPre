public class Objective2Lab5 {
  public static void main(String[] args) {
    double num = Math.sqrt(3 * 3); // num => 3
    double result = Math.sqrt(4) + Math.sqrt(9); // result => 2 + 3 => 5

    double side1, side2, hypotenuse;

    // Calculate the length of the hypotenuse of a right triangle
    side1 = 10.0;
    side2 = 15.5;
    hypotenuse = Math.sqrt((side1 * side1) + (side2 * side2));

    System.out.println("The hypotenuse of a triangle with sides " +
    side1 + " and " + side2 + " is " + hypotenuse);
  }
}
