public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age;
    int num1;
    double seconds, e, checking;
    double num2;
    String firstName, lastName, title;
    String string1, string2;

    num1 = 5;
    num2 = 6.5;
    string1 = "hello";
    string2 = "world";

    x = 10;
    y = 400;
    age = 39;
    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " + seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + lastName);
    System.out.println(num1 + " " + num2 + string1 + string2);
  }
}
