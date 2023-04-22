package Composite;

//file
public class Leaf extends Composite {
    private String name;
    private int size;

    public Leaf(String name, int size) {
        this.name = name;
        this.size = size;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println( prefix + "/" + this);
    }
}
