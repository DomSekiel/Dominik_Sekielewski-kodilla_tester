public class Loops {
    public static void main(String[] args) {
        int[] numbers = new int[]{1, 2, 3, 4, 5};
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
        suma = suma + numbers[i];
        }
        System.out.println(suma);
    }

}