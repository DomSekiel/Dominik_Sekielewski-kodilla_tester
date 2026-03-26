public class Grades {

        private int[] grades;
        private int size;

    public Grades() {
            this.grades = new int[10];
            this.size = 0;
        }

        public void add (int value){
            if (this.size == 10) {
                return;
            }
            this.grades[this.size] = value;
            this.size++;
        }

        public void wyswietlOceny () {
            for (int i = 0; i < this.size; i++) {
                System.out.println("Ocena: " + this.grades[i]);
            }
        }

        public double sredniaOcen () {
            int suma = 0;
            for (int i = 0; i < this.size; i++) {
                suma = suma + this.grades[i];
            }
            return (double) suma / this.size;
        }

        public int ostatniaOcena () {
            if (this.size == 0) {
                throw new IllegalStateException("Brak ocen do wyswietlenia"); //IllegalStateException jest
                // w tym miejscu bardziej zasadne niż IllegalArgumentException bo to stan obiektu (brak ocen)
                // nie pozwala na wykonanie operacji, a nie że przekazany do metody argument jest niepoprawny
            }
            return this.grades[this.size - 1];
        }
    }