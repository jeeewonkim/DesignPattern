package Composite;

public class Main {
    public static void main(String[] args) {
        System.out.println("Making root entries...");
        Component rootdir = new Component("root");
        Component bindir = new Component("bin");
        Component tmpdir = new Component("tmp");
        Component usrdir = new Component("usr");

        rootdir.add(bindir);
        rootdir.add(tmpdir);
        rootdir.add(usrdir);

        bindir.add(new Leaf("vi", 10000));
        bindir.add(new Leaf("latex", 20000));

        Component youngjin = new Component("Youngjin");
        Component gildong = new Component("GilDong");
        Component dojung = new Component("Dojung");

        usrdir.add(youngjin);
        usrdir.add(gildong);
        usrdir.add(dojung);

        youngjin.add(new Leaf("diary.html", 100));
        youngjin.add(new Leaf("composite.html", 200));
        gildong.add(new Leaf("c", 300));
        dojung.add(new Leaf("d",10));
        dojung.add(new Leaf("f", 30));

        rootdir.printList();

    }
}
