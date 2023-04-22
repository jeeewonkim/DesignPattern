package Composite;

import java.util.ArrayList;
import java.util.List;

//directory
public class Component extends Composite {
    private String name;
    private List<Composite> directory = new ArrayList<>();

    public Component(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        for (Composite composite : directory) {
            size = size + composite.getSize();
        }
        return size;
    }

    @Override
    protected void printList(String prefix) {

        System.out.println(prefix + "/" + this);
        for(Composite composite: directory){
            composite.printList(prefix+"/"+name);
        }
    }
    public Composite add(Composite composite){
        directory.add(composite);
        return this;
    }
}
