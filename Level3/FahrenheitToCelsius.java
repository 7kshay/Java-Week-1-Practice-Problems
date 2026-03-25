import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {

        // Taking user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();

        // Result stored as a variable
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        // Output
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");

        input.close();
    }
}
```

**Output:**
```
Enter the temperature in Fahrenheit: 212
The 212.0 fahrenheit is 100.0 celsius