package dataproviders;

import models.Persons;
import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.List;

import static utils.CsvReader.*;

public class TestDataProvider {

    @DataProvider(name = "persons")
    public static Object[][] persons() {
        return getListObjectsFromCsv().stream().map(persons -> new Object[]{persons.getFirstName(), persons.getLastName(), persons.getAge()})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "personsMan")
    public static Object[][] personsMan() {
        return getListManFromCsv().stream().map(persons -> new Object[]{persons.getFirstName(), persons.getLastName(), persons.getAge()})
                .toArray(Object[][]::new);
    }

    @DataProvider(name = "personsWoman")
    public static Object[][] personsWoman() {
        return getListWomanFromCsv().stream().map(persons -> new Object[]{persons.getFirstName(), persons.getLastName(), persons.getAge()})
                .toArray(Object[][]::new);
    }

    @DataProvider
    public static Object[][] personsPartner() {
        List<Persons> persons = getListObjectsFromCsv();

        Object[][] objects = {
                { persons.get(0).getFirstName(), persons.get(0).getLastName(), persons.get(0).getAge() },
                { persons.get(4).getFirstName(), persons.get(4).getLastName(), persons.get(4).getAge() }
        };

        return objects;
    }
}