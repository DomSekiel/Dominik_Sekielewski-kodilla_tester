public class FirstClass {

    public static void main(String[] args) {

       Notebook notebook = new Notebook(600, 1000, 2024 );

       System.out.println("notebook.weight: " + notebook.getWeight());
       System.out.println("notebook.price: " + notebook.getPrice());
       System.out.println("notebook.year: " + notebook.getYear());

       notebook.checkPrice();
       notebook.checkWeight();
       notebook.checkYearAndPrice();

       System.out.println();

       Notebook heavyNotebook = new Notebook(2000, 1500, 2020);

       System.out.println("heavyNotebook.weight:" + heavyNotebook.getWeight());
       System.out.println("heavyNotebook.price:" + heavyNotebook.getPrice());
       System.out.println("heavyNotebook.year:" + heavyNotebook.getYear());

       heavyNotebook.checkPrice();
       heavyNotebook.checkWeight();
       heavyNotebook.checkYearAndPrice();

       System.out.println();

       Notebook oldNotebook = new Notebook(1600, 500, 2010);

       System.out.println("oldNotebook.weight:" + oldNotebook.getWeight());
       System.out.println("oldNotebook.price:" + oldNotebook.getPrice());
       System.out.println("oldNotebook.year:" + oldNotebook.getYear());

       oldNotebook.checkPrice();
       oldNotebook.checkWeight();
       oldNotebook.checkYearAndPrice();
    }
}