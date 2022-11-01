package model;

import view.IService;

import java.util.List;

public class BookModel implements IService<Book, List<Book>> {

    @Override
    public void insert(Book obj, List<Book> objs) {
        objs.add(obj);
    }

    @Override
    public void delete(Book obj, List<Book> objs) {
        for (int i = 0; i < objs.size(); i++) {
            if (objs.get(i).getId() == obj.getId()){
                objs.remove(objs.get(i));
            }
        }
    }

    @Override
    public void update(Book obj, List<Book> objs) {
        for (Book book:objs){
            if (obj.getId()== book.getId()){
                objs.remove(book);
                objs.add(obj);
            }
        }
    }

}
