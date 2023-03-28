import Adapter.Adaptee;
import Template.AbstractDisplay;
import Template.CharDisplay;
import Template.StringDisplay;

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

        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello, World!");

        d1.display();
        d2.display();
    }

}