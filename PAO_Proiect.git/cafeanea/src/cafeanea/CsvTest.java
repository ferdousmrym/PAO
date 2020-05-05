package cafeanea;

import csv.CsvReader;
import csv.CsvWriter;
import cafeanea.model.CafeneaDatabase;
import cafeanea.model.Bautura;
import cafeanea.db.impl.InMemoryCafeneaDatabase;

import java.io.*;


public class CsvTest {
    private final static String bautura_csv_path = "bauturi.csv";

    private CsvTest() {
    }

    public static void writeToFile(CafeneaDatabase db) throw

    IOException {
        BufferedWriter bauturiWriter = new BufferedWriter(new FileWriter(bautura_csv_path));
        CsvWriter<Bautura> bauturaCsv = new CsvWriter<>(bauturiWriter, new Bautura());

        for (Bautura bautura : db.getBauturi()) {
            bauturaCsv.writobject(bautura);
        }
        bauturiWriter.flush();
    }

    public static InMemoryCafeneaDatabase readFromFile() throws IOException {
        BufferedReader bauturiReader = new BufferedReader(new FileReader(bautura_csv_path));
        CsvReader<Bautura> bauturaCsv = new CsvReader<>(bauturiReader, new Bautura());
        InMemoryCafeneaDatabase db = new InMemoryCafeneaDatabase();


        while (bauturaCsv.hasMoreObject()) {
            Bautura bautura = new Bautura();
            bauturaCsv.readobject(bautura);
            db.addBautura(Bautura);
        }

        return db;
    }
}



