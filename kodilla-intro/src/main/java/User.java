public class User {
    String name;
    int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static <result> void main(String[] args) {
        User stefan = new User("Stefan", 23);
        User kasia = new User("Kasia", 32);
        User zygmunt = new User("Zygmunt", 50);
        User krysia = new User("Krysia", 62);
        User krzysztof = new User("Krzysztof", 18);
        User matylda = new User("Matylda", 3);

        User[] users = {stefan, kasia, zygmunt, krysia, krzysztof, matylda};

        int result = 0;
        for (int i = 0; i < users.length; i++) {
            result = result + users[i].getAge();}
        {
        System.out.println("Wiek sumarycznie: " + result);
    }
    int sredniaWieku = result / users.length; {
            System.out.println("Srednia wieku: " + sredniaWieku);
        }
        for (int i = 0; i < users.length; i++)
            if (users[i].getAge() < sredniaWieku) {
                System.out.println("User mlodszy niz srednia wieku: ");
                System.out.println(users[i].getName());
        }
    }
}