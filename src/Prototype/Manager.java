package Prototype;

import java.util.HashMap;
import java.util.Map;

public class Manager{
    private Map<String, Product> showcase = new HashMap<>();
    public void register(String name, Product p){
        showcase.put(name, p);
    }

    public Product create(String prototypeName){
        Product p = showcase.get(prototypeName);
        return p.createCopy();
    }
}
