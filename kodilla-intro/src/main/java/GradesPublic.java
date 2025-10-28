public class GradesPublic {
    public static void main() {
        Grades oceny = new Grades();
        oceny.add(1);
        oceny.add(6);
        oceny.add(4);
        oceny.add(3);
        oceny.wyswietlOceny();

        System.out.println("Srednia ocen: " + oceny.sredniaOcen());
        System.out.println("Ostatnia ocena: " + oceny.ostatniaOcena());
    }
}