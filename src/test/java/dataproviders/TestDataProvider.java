package dataproviders;

import models.Persons;
import org.testng.annotations.DataProvider;

import java.util.List;

import static utils.CsvReader.getListObjectsFromCsv;

public class TestDataProvider {
    @DataProvider(name = "persons")
    public static Object[][] persons() {
        List<Persons> persons = getListObjectsFromCsv();
        Object[][] objects = new Object[persons.size()][3];

        for(int i = 0; i < persons.size(); i++) {
            objects[i][0] = persons.get(i).getFirstName();
            objects[i][1] = persons.get(i).getLastName();
            objects[i][2] = persons.get(i).getAge();
        }
        return objects;

    }
}