package cafenea.db.impl;


import cafenea.model.Suc;
import cafenea.model.Cafea;
import cafenea.db.CafeneaDatabase;


import java.util.List;

public interface CafeneaDatabase{
    void addCafenea(Cafenea cafenea);

    List<Cafenea> getCafenele();

    Cafenea findCafeneaByName(String name);

    void addCafea(Cafea cafea);

    List<Cafea> getCafea();
}

