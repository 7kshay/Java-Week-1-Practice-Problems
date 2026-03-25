import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {

        // Taking user input
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = input.nextDouble();

        // Result stored as a variable
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        // Output
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");

        input.close();
    }
}
```

**Output:**
```
Enter the temperature in Celsius: 100
The 100.0 celsius is 212.0 fahrenheit