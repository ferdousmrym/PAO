package cafenea.db;

import cafeanea.model.Bautura;
import cafeanea.model.Cafenea;


import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class DatabaseAudit implements CafeneaDatabase{
    private CafeneaDatabase db;
    private BufferedWriter logWriter;

    public DatabaseAudit(CafeneaDatabase db, String logFilePath) throws IOException{
        this.db = db;

        Path path = Paths.get(logFilePath);
        this.logWriter =  Files.newBufferedWriter(path, UTF_8);
    }

    @Override
    public void addBautura((Bautura bautura){
        logAction("AddBautura");
        db.addBautura(bautura);
    }

    @Override
    public List<Bautura> getBauturi(){
        logAction("getBauturi");
        return db.getBauturi();
    }

    @Override
    public Bautura findBauturaByName(String name) {
        logAction("findBauturaByName");
        return db.findBauturaByName(name);
    }

    @Override
    public void addCafenea(Cafenea cafenea){
        logAction("addCafenea");
        db.addCafenea(cafenea);
    }

    @Override
    public List<Cafenea> getCafenele(){
        logAction("getCafenele");
        return db.getCafenele();
    }

    private void locAction(String actionName){
         Date timestamp = new Date();
        String currentThreadName = Thread.currentThread().getName();
        String line = timestamp + " [" + actionName + "] @ " + currentThreadName + "\n";

        try {

            logWriter.write(line);
            logWriter.flush();
        } catch (IOException e) {
            System.err.print("Unable to write to log file");
            e.printStackTrace();
        }
    }
}