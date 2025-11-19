import java.util.Scanner;

public class Kolor {
    public static void main(String[] args) {
        String literaKoloru = pierwszaLiteraKoloru();
        String nazwaKoloru = "";
        switch (literaKoloru.toLowerCase()) {
            case "c":
                nazwaKoloru = "Czerwony";
                break;
            case "z":
                nazwaKoloru = "Zielony";
                break;
            case "n":
                nazwaKoloru = "Niebieski";
                break;
            case "p":
                nazwaKoloru = "Pomaranczowy";
                break;
            case "f":
                nazwaKoloru = "Fioletowy";
                break;
            case "b":
                nazwaKoloru = "Brazowy";
                break;
        }

            System.out.println("Pelna nazwa koloru: " + nazwaKoloru);
        }
        public static String pierwszaLiteraKoloru() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj pierwsza litere koloru: ");
            String litera = scanner.next().toLowerCase();
            return litera;
        }
    }