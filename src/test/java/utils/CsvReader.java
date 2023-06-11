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

    private static final String PATH_MAN = "src\\test\\resources\\dataMan.csv";

    public static List<Persons> getListManFromCsv(){
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(PATH_MAN));
            CsvToBean<Persons> csvObjectBuilder = new CsvToBeanBuilder<Persons>(reader)
                    .withType(Persons.class)
                    .build();
            return csvObjectBuilder.parse();
        }
        catch (IOException ex) {
            throw new RuntimeException("File not be found" + PATH_MAN + ex );

        }
    }

    private static final String PATH_WOMAN = "src\\test\\resources\\dataWoman.csv";

    public static List<Persons> getListWomanFromCsv(){
        try {
            BufferedReader reader = Files.newBufferedReader(Paths.get(PATH_WOMAN));
            CsvToBean<Persons> csvObjectBuilder = new CsvToBeanBuilder<Persons>(reader)
                    .withType(Persons.class)
                    .build();
            return csvObjectBuilder.parse();
        }
        catch (IOException ex) {
            throw new RuntimeException("File not be found" + PATH_WOMAN + ex );

        }
    }
}