package Template;

public class StringDisplay extends AbstractDisplay{
    String str;

    public StringDisplay(String str){
        this.str = str;
    }
    @Override
    void open() {
        System.out.println(printLine());
    }

    @Override
    void print() {
        System.out.println("|"+str+"|");
    }

    @Override
    void close() {
        System.out.println(printLine());
    }

    public String printLine(){
        String line = "";
        for (int i =0; i<str.getBytes().length;i++){
            line = line + "-";
        }
        return "+" + line + "+";
    }
}
