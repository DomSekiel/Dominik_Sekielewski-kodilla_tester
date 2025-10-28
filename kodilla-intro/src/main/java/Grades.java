public class Grades {
    private int[] grades; //dlaczego private, a już poniżej public
    private int size;

    public Grades() {
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void wyswietlOceny() {
        for (int i = 0; i < this.size; i++) {
            System.out.println("Ocena: " + this.grades[i]);
        }
    }

    public double sredniaOcen() {
        int suma = 0;
        for (int i = 0; i < this.size; i++) {
            suma = suma + this.grades[i];
        }
        return (double) suma / this.size;
    }

    public int ostatniaOcena() {
        return this.grades[this.size - 1];
    }
}