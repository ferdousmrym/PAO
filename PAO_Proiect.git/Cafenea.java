import java.util.*;

public class Cafenea {
    private Map<String, Bautura> map = new HashMap<>();
    
    private static Cafenea singleton;
    
    private Cafenea() {
    }
    
    public static Cafenea getInstance() {
        if (singleton == null) {
            singleton = new Cafenea();
        }
        return singleton;
    }
    
    public void adaugaBautura(Bautura b) throws NameAlreadyExistsException {
        if (map.containsKey(b.nume)) { // map.keySet().contains(b.nume)
            throw new NameAlreadyExistsException();
        }
        map.put(b.nume, b);
    }
    
     public void afiseazaBauturi() {
        for (String nume : map.keySet()) {
        // "b" is the associated value in the map "map" key "name"         
        Bautura b = map.get(nume);
        System.out.println(b);
        }
    }
    
    public void afiseazaCafele() {
        for (String nume : map.keySet()) {
            // "b" is the associated value in the map "map" key "name"
            Bautura b = map.get(nume);
            if (b instanceof Cafea) {
                System.out.println(b);
            }
        }
    }
    
    public void stergeBautura(String nume) {
        map.remove(nume); //will delete from the map the pair with the key "name"
    }
    
    public void afiseazaSortat() {
        Comparator<Bautura> comp = (b1, b2) -> b1.pret - b2.pret;
        
        //List<Bautura> copy = new ArrayList<>(map.values()); 
        //alternative for the above line
        List<Bautura> copy = new ArrayList<>();
        for (String nume : map.keySet()) {
            copy.add(map.get(nume));
        }
        
        Collections.sort(copy, comp);
        copy.forEach(System.out::println); // e -> System.out.println(e)
        
        
    }
}
