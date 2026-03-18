import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        // Taking user inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        double number1 = input.nextDouble();

        System.out.print("Enter number 2: ");
        double number2 = input.nextDouble();

        // Results stored as variables
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Output
        System.out.println("The addition, subtraction, multiplication, and division value of "
                + number1 + " and " + number2
                + " is " + addition
                + ", " + subtraction
                + ", " + multiplication
                + ", and " + division);

        input.close();
    }
}
```

**Output:**
```
Enter number 1: 10.0
Enter number 2: 2.0
The addition, subtraction, multiplication, and division value of 10.0 and 2.0 is 12.0, 8.0, 20.0, and 5.0