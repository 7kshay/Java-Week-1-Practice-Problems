import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {

        // Taking user inputs
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number 2: ");
        int number2 = input.nextInt();

        // Results stored as variables
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Output
        System.out.println("The Quotient is " + quotient
                + " and Remainder is " + remainder
                + " of two numbers " + number1
                + " and " + number2);

        input.close();
    }
}
```

**Output:**
```
Enter number 1: 10
Enter number 2: 3
The Quotient is 3 and Remainder is 1 of two numbers 10 and 3