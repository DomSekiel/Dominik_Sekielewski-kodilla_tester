public class ApplicationUser {
    String name;
    double age;
    double height;

    public ApplicationUser(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void checkAge() {
        if (this.age > 30) {
            System.out.println("Adam is older than 30");
        } else {
            System.out.println("Adam is younger than 30");
        }
    }

    public void checkHeight() {
        if (this.height > 160) {
            System.out.println("Adam is taller than 160cm");
        } else {
            System.out.println("Adam is shorter than 160cm");
        }
    }
}
