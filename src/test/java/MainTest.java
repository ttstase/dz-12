import dataproviders.TestDataProvider;
import models.Persons;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class MainTest {
    private Person person;

    @Test(dataProvider = "persons", dataProviderClass = TestDataProvider.class)

    public void testGetPersonsData(String firstName, String lastName, int age) {
        person = new Person(firstName, lastName, age);
        SoftAssert softAssert = new SoftAssert();
        System.out.println(firstName + " " + lastName + " " + age);
        softAssert.assertEquals(person.getFirstName(), firstName);
        softAssert.assertEquals(person.getLastName(), lastName);
        softAssert.assertEquals(person.getAge(), age);
        softAssert.assertAll();
    }

    @Test(dataProvider = "personsWoman", dataProviderClass = TestDataProvider.class)

    public void testIsRetiredWoman(String firstName, String lastName, int age) {
        person = new Woman(firstName, lastName, age);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(person.isRetired());
    }

    @Test(dataProvider = "personsMan", dataProviderClass = TestDataProvider.class)

    public void testIsRetiredMan(String firstName, String lastName, int age) {
        person = new Man(firstName, lastName, age);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(person.isRetired());
    }

    @Test(dataProvider = "personsPartner", dataProviderClass = TestDataProvider.class)
    public void testPartner(String firstName, String lastName, int age){
        Man vasyl = new Man(firstName, lastName, age);
        Woman maria = new Woman(firstName, lastName, age);
        vasyl.registerPartnership(maria);
        Assert.assertEquals(vasyl.getPartner(), maria);
        Assert.assertEquals(maria.getPartner(), vasyl);
    }
}