import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Person man = new Man("Vasyl", "Petrenko", 64);
        Person woman = new Woman("Maria", "Lysenko", 63);

        woman.registerPartnership(man);

        System.out.println("Ім'я - " + man.getFirstName()
                + ", Прізвище - " + man.getLastName()
                + ", Вік - " + man.getAge());

        if (man.isRetired()) {
            System.out.println("Пенсіонер");
        }
        else
            System.out.println("Не пенсіонер");

        System.out.println("Ім'я - " + woman.getFirstName()
                + ", Прізвище - " + woman.getLastName()
                + ", Вік - " + woman.getAge());

        if (woman.isRetired()) {
            System.out.println("Пенсіонер");
        }
        else
            System.out.println("Не пенсіонер");

        Person partner = woman.getPartner();
        if (partner != null) {
            System.out.println("Partner's name: " + partner.getFirstName() + " " + partner.getLastName());
            System.out.println("Partner's age: " + partner.getAge());
        } else {
            System.out.println("No partner yet.");
        }

    }
}