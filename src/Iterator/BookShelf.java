package Iterator;

public class BookShelf implements Aggregate {
    private Book[] books;
    private int last = 0;

    public BookShelf(int size) {
        this.books = new Book[size];
    }

    public Book getBookAt(int index) {
        if (index < 0 || index > books.length) {
            throw new IndexOutOfBoundsException();
        }
        return books[index];
    }

    public void appendBook(Book book) {
        if (last > books.length){
            throw new ArrayIndexOutOfBoundsException();
        }
        books[last] = book;
        last++;
    }

    public int getLength(){
        return last;
    }

    public Iterator iterator(){
        return new BookShelfIterator(this);
    }


}
