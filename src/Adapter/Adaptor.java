package Adapter;

// 어댑터
public class Adaptor implements  Print{
    int DC_output = 12;
    //바꿔주는값을 Adaptee가 출력..
    @Override
    public int DC_output(Adaptee adaptee) {
        return DC_output;
    }



}
