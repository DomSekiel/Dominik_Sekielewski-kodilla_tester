import java.util.Random; // konieczność zawarcia tego wyrażania wygooglowane w stackoverflow

public class RandomNumbers {
    int min = 0;
    int max = 30;
    int result = 0;

    public void generateRandomNumbers() {
        Random random = new Random();
        while (result <= 5000) {
            int number = random.nextInt(31);
            result = result + number;

            System.out.println("Ostateczny wynik: " + result);

            if (number >= min) {
               min = number;
            }
            if (number <= max) {
                max = number;
            }
        }
    }
    int getMin() {
        return min;
    }

    int getMax() {
        return max;
    }

    public static void main(String[] args) {
        RandomNumbers randomNumbers = new RandomNumbers();
        randomNumbers.generateRandomNumbers();
        System.out.println("Najmniejsza wylosowana liczba: " + randomNumbers.getMin());
        System.out.println("Najwieksza wylosowana liczba: " + randomNumbers.getMax());
    }
}