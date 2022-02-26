import java.util.Random;

class Calculator {

    Calculator(){

    }

    int add(int a , int b){
        return a + b;
    }

    int subtract(int a , int b){
        return a - b;
    }

    int multiply(int a , int b){
        return a * b;
    }

    int divide(int a , int b){
        return a / b;
    }


    /*
    Returns the n'th number in the fibonacci sequence
    https://en.wikipedia.org/wiki/Fibonacci_number
    Example below
    n = x
    0 = 0
    1 = 1
    2 = 1
    3 = 2
    4 = 3
    5 = 5
    .
    .
    .
    etc
     */
    int fibonacciNumberFinder(int n){
        int[] fibonacci_sequence = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                fibonacci_sequence[i] = 0;
                continue;
            }
            if (i == 1) {
                fibonacci_sequence[i] = 1;
                continue;
            }

            fibonacci_sequence[i] = fibonacci_sequence[i - 1] + fibonacci_sequence[i - 2];
        }

        return fibonacci_sequence[n];
    }


    /*
    Returns binary value of the given int number
    The binary number will be stored as a string
    if int a = 0 then this method returns: 0
    if int a = 10 then this method returns: 1010
    if int a = 16 then this method returns: 10000
     */
    String intToBinaryNumber(int n){
        return Integer.toBinaryString(n);
    }

    /*
    Create a completely unique String identifier for a given string
    Each createdID must contain the string n in its unaltered Form
    if String n = "Jason"
    then the created ID could be = Jasonklfgn3jknnvksdfm - Because it contains the unaltered String n and is unique

    if you run this function twice with the same String input, it must return 2 unique String IDs
     */
    String createUniqueID(String n){
        StringBuilder string_builder = new StringBuilder(n);
        string_builder.append('_');

        Random rand = new Random();
        int unique_id_length = rand.nextInt(10) + 5;

        for (int i = 0; i < unique_id_length; i++) {
            int alpha_numeric = rand.nextInt(62) + 48;
            if (alpha_numeric > 57) alpha_numeric += 7;
            if (alpha_numeric > 90) alpha_numeric += 6;

            string_builder.append((char) alpha_numeric);
        }
        // Add another comment.
        return string_builder.toString();
    }


}
