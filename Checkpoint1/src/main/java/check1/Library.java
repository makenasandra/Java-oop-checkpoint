package check1;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books = new ArrayList<>();

    Library(){}

    public void addBook(String book){
        books.add(book);
    }


    public List printBooks() {
        return books;
    }
}
