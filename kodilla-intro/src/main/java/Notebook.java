public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good.");
        } else if (this.price >= 1000)
            System.out.println("This notebook is expensive.");
    }

    public void checkWeight() {
        if (this.weight < 1000) {
            System.out.println("This notebook is light");
        } else if (this.weight > 1000 && this.weight < 1800) {
            System.out.println("This notebook is not to heavy");
        } else if (this.weight >= 2000) {
            System.out.println("This notebook is to heavy");
        }
    }

    public void checkYearAndPrice() {
        if (this.year >= 2020 && this.price <= 1000) {
            System.out.println("The correlation between price and year of production is good");
        } else if (this.year <= 2020 && this.price > 1400) {
            System.out.println("the correlation between price and year of production is unfavorable");
        } else if (this.year >= 2010 && this.price < 1000)
            System.out.println("why You want to buy it :)");
    }
}