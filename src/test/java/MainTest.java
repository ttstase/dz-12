import dataproviders.TestDataProvider;
import models.Persons;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest {

    @Test(dataProvider = "persons", dataProviderClass = TestDataProvider.class)
    public void testGetFirstName(String firstName, String lastName, int age) {
        Persons person = new Persons();
        System.out.println(firstName + " " + lastName + " " + age);
        Assert.assertEquals(person, person);
    }
}