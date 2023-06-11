import java.sql.SQLOutput;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private Person partner;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) { this.age = age; }

    public Person getPartner() {
        return partner;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    public boolean isRetired() {
        return false;
    }

    public void registerPartnership(Person partner) {
        if (this.partner == null && partner.getPartner() == null) {
            this.partner = partner;
            if (this instanceof Woman) {
                this.setLastName(partner.getLastName());
            }
            else {
                System.out.println(getFirstName() + " " + getLastName() + " already has a partner");
            }
        }
        partner.setPartner(this);

    }
    public void deregisterPartnership(boolean shouldRevertLastName) {
        if (partner != null) {
            if (this instanceof Woman) {
                this.setPartner(null);
                this.partner = null;
            }
        }
    }
}