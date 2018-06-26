import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");
    System.out.print("Well, thanks for answering my rude questions, ");
    System.out.println(name + ".");

    String yo;

    System.out.print("Hello, how do you respond? ");
    yo = keyboard.next();
    System.out.println(yo + " Nice response");
  }
}

// 1. Program does not blow up when given integer value when program expects
// double. I suspect this is because an integer is easily converted to a
// double whereas the other way around is not necessarily always possible.

// 2. Giving program a String when it expects numeric value does not blow up
// program. This is probably because numeric values can be converted to String
// easily - but the reverse is not true.

// 3. Was unable to blow up program on first question for String. Second
// question blows up when provide string value for expected numeric. Third
// question blows up when provide string value for expected numeric. Same
// for fourth question.
