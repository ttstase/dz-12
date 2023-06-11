public class Woman extends Person{

    public Woman(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    @Override
    public boolean isRetired() {
        if (getAge() >= 60) {
            System.out.println(getFirstName() + " " + getLastName() + " is retired");
            return true;
        }
        System.out.println(getFirstName() + " " + getLastName() + " has not yet reached retirement age");
        return false;
    }
}