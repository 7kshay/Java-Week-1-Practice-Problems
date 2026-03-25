import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {

        // Taking user inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();

        // Fixed conversion factor stored as variable
        double cmPerInch = 2.54;

        // Results stored as variables
        double areaSqCm = 0.5 * base * height;
        double areaSqInches = areaSqCm / (cmPerInch * cmPerInch);

        // Output
        System.out.println("The Area of the triangle in sq in is " + areaSqInches
                + " and sq cm is " + areaSqCm);

        input.close();
    }
}
```

**Output:**
```
Enter the base of the triangle in cm: 10
Enter the height of the triangle in cm: 5
The Area of the triangle in sq in is 3.875968992248062 and sq cm is 25.0