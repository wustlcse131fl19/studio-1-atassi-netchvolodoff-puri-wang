package studio1;

import support.cse131.ArgsProcessor;

public class Average {
    public static void main(String[] args){
        ArgsProcessor ap = new ArgsProcessor(args);
        int firstNumber = ap.nextInt("What is the first number?");
        int secondNumber = ap.nextInt("What is the second number?");
        double average = (double)(firstNumber + secondNumber)/2;
        System.out.println("Your average is equal to: " + average);

    }
    /*
    1. int
    2. boolean
    3. int
    4. double
    5. String
    6. String
    7. double
    8. double
     */
}
