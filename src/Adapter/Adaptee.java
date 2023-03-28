package Adapter;

public class Adaptee {
    private int AC_output = 220;

    Adaptor adaptor = new Adaptor();

    public void printAC_to_DC(){
        System.out.printf(adaptor.DC_output+"V");
    }

}
