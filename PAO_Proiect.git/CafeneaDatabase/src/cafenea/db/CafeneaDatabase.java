package cafenea.db;

import cafeanea.model.Bautura;
import cafeanea.model.Cafenea;

import java.util.List;

public interface CafeneaDatabase {
    void addBautura(Bautura bautura);
        List<Bautura> getBauturi();

        Cafenea findCafeneaByName(String name);
        void addCafenea(Cafenea cafenea);
        List<Cafenea> getCafenele();
}

