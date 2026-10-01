import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("========== Calculator ==========");
        while(true) {

        System.out.println("\nSelect an Operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit.");
        System.out.println("Enter your Choice: ");
        int operation = sc.nextInt();

        if(operation == 5){
            System.out.println("Thank you for using Calculator.");
            return;
        }
            String operationName = "";

            switch (operation) {

                case 1:
                    operationName = "Addition";
                    break;

                case 2:
                    operationName = "Subtraction";
                    break;

                case 3:
                    operationName = "Multiplication";
                    break;

                case 4:
                    operationName = "Division";
                    break;

                case 5:
                    System.out.println("Thank you for using the Calculator.");
                    return;

                default:
                    System.out.println("Invalid operation.");
                    continue;
            }

            System.out.print("Enter First Number (" + operationName + "): ");
            int a = sc.nextInt();

            System.out.print("Enter Second Number (" + operationName + "): ");
            int b = sc.nextInt();

        double res = 0;

            switch (operation) {
                case 1:
                    res = addition(a, b);
                    break;

                case 2:
                    res = subtraction(a, b);
                    break;

                case 3:
                    res = multiplication(a, b);
                    break;

                case 4:
                    res = division(a, b);
                    break;

                default:
                    System.out.println("Invalid Operation.");
                    continue;
            }
            System.out.println("Result: " + res);
        }

    }
    public static int multiplication(int a, int b){
        return a*b;
    }

    public static int addition(int a, int b){
        return a + b;
    }

    public static int subtraction(int a, int b){
        return a - b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

}
