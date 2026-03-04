package fizzbuzz;

public class FizzBuzz {
    public static String getResult(int number) {

        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        }

        if (number % 3 == 0) {
            return "Fizz";
        }

        if (number % 5 == 0) {
            return "Buzz";
        }

        else {
            return "None";
        }
    }
}
