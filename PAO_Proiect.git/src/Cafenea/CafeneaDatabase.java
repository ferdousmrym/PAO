package Cafenea;

import cafenea.model.Cafea;
import cafenea.model.Suc;

import java.util.List;

public  interface CafeneaDatabase{
    void addCafenea(Cafenea cafenea);
    
    List<Cafenea> getCafenele();
    
    Cafenea findCafeneaByName(String name);
    
    void addCafenea(Suc suc);
    
    List<Suc> getSucuri();

    
    
    
}
   
   

 