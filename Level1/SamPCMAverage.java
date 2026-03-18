public class SamPCMAverage {
    public static void main(String[] args) {

        // Fixed values stored as variables
        String name = "Sam";
        double mathsMark = 94;
        double physicsMark = 95;
        double chemistryMark = 96;
        int totalSubjects = 3;

        // Result stored as variables
        double totalMarks = mathsMark + physicsMark + chemistryMark;
        double averageMark = totalMarks / totalSubjects;

        // Output
        System.out.println(name + "'s average mark in PCM is " + averageMark);
    }
}
```

**Output:**
```
Sam's average mark in PCM is 95.0