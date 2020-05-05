package csv;

public interface CsvSerializable {
    String[] getColumnNames();
    String[] toStringArray();
    void fromStringArray(String[] data);
}
