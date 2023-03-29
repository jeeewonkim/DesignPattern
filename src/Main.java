import FactoryMethod.Factory.Factory;
import FactoryMethod.idcard.IDCardFactory;
import FactoryMethod.Factory.Product;

public class Main {
    public static void main(String[] args) {
        /* 2주차 Iterator
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("a"));
        bookShelf.appendBook(new Book("b"));
        bookShelf.appendBook(new Book("c"));
        bookShelf.appendBook(new Book("d"));

    Iterator it = bookShelf.iterator();

        while(it.hasNext()){
        Book book = (Book) it.next();
        System.out.println(book.getName());
    }*/

       /* 3주차 Adapter
        Adaptee adaptee = new Adaptee();
        adaptee.printAC_to_DC();*/

        /*4주차 Template
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, World!");

        d1.display();
        d2.display();*/

        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngjin Kim");
        Product card2 = factory.create("Sujeong Kim");
        Product card3 = factory.create("Chungyong Kim");
        card1.use();
        card2.use();
        card3.use();

    }

}