package utils;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import models.Persons;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvReader {

    private static final String PATH = "src\\test\\resources\\data.csv";

    public static List<Persons> getListObjectsFromCsv(){
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(PATH));
            CsvToBean<Persons> csvObjectBuilder = new CsvToBeanBuilder<Persons>(reader)
                    .withType(Persons.class)
                    .build();
            return csvObjectBuilder.parse();
        }
        catch (IOException ex) {
            throw new RuntimeException("File not be found" + PATH + ex );

        }
    }
}
