package cafeanea.db.impl;

import cafeanea.model.Bautura;
import cafeanea.model.CafeneaDatabase;
import cafeanea.db.Cafenea;

import java.util.ArrayList;
import java.util.List;

public final class InMemoryCafeneaDatabase implements CafeneaDatabase {
    private final List<Bautura> bauturaList = new ArrayList<>();
    private final List<Cafenea> cafeneaList = new ArrayList<>();


    @Override
    public void addBautura(Bautura bautura) {
        bauturaList.add(bautura);
    }

    @Override
    public List<Bautura> getbauturi() {
        return bauturaList;
    }

    @Override
    public Bautura findBauturaByName(String name) {
        for (Bautura bautura : bauturaList) {
            if (bautura.getName().equals(name)) {
                return bautura;
            }
        }
        return null;
    }

    @Override
    public void addCafenea(Cafenea cafenea) {
        cafeneaList.add(cafenea);
    }
    @Override
    public String toString() {
        return "InMemoryCafeneaDatabase{" +
                "bauturaList=" + bauturaList +
                '}';
    }
}
