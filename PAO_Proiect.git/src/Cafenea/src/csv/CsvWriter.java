package csv;

import java.io.BufferedWriter;
import java.io.IOException;


public class CsvWriter<T extends CsvSerializable>{
    private BufferedWriter writer;

    public CsvWriter(BufferedWriter writer, T object) throws IOException {
    this.writer = writer;



if (object != null) {
String[] columns = object.getColumnNames();
String header = String.join(",", columns) + '\n';
writer.write(header);
writer.flush();

        }
    }

public void writeObject(T object) throws IOException {
String[] strings = object.toStringArray();
String line = String.join(",", strings) + '\n';
writer.write(line);

    }
}