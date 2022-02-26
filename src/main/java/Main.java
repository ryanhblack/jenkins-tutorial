import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scanner = new Scanner(System.in);
        boolean done = false;

        System.out.println("Welcome to the calculator!");
        System.out.println("Enter a command:");

        while(!done) {
            String input = scanner.nextLine();
            String[] calc_args = input.split(" ");

            if (calc_args[0].equals("add")) {
                System.out.println(calc.add(Integer.parseInt(calc_args[1]), Integer.parseInt(calc_args[2])));
            }
            else if (calc_args[0].equals("subtract")) {
                System.out.println(calc.subtract(Integer.parseInt(calc_args[1]), Integer.parseInt(calc_args[2])));
            }
            else if (calc_args[0].equals("multiply")) {
                System.out.println(calc.multiply(Integer.parseInt(calc_args[1]), Integer.parseInt(calc_args[2])));
            }
            else if (calc_args[0].equals("divide")) {
                System.out.println(calc.divide(Integer.parseInt(calc_args[1]), Integer.parseInt(calc_args[2])));
            }
            else if (calc_args[0].equals("fibonacci")) {
                System.out.println(calc.fibonacciNumberFinder(Integer.parseInt(calc_args[1])));
            }
            else if (calc_args[0].equals("binary")) {
                System.out.println(calc.intToBinaryNumber(Integer.parseInt(calc_args[1])));
            }
            else {
                done = true;
            }
        }
    }

}
