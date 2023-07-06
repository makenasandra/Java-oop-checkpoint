package check2;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books;

    Library(){
        this.books = new ArrayList<>();
    }

    public void addBook(String book){
        this.books.add(book);
    }


    public List printBooks() {
        return this.books;
    }
}

