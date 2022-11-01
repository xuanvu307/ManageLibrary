package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Tạo 1 list book
        Book book = new Book(1,"sach1","subtitle1","author1",4);
        Book book2 = new Book(2,"sach2","subtitle2","author2",0);
        List<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book2);

        //Tạo list reader
        Reader reader = new Reader(1,"address1","Name1","phone1");
        Reader reader2 = new Reader(2,"address2","Name2","phone2");
        List<Reader> readers = new ArrayList<>();
        readers.add(reader);
        readers.add(reader2);

        //Tạo 1 list
        TicketBook ticketBook = new TicketBook(reader,book);
        TicketBook ticketBook2 = new TicketBook(reader2,book2);
        List<TicketBook> ticketBooks = new ArrayList<>();
        ticketBooks.add(ticketBook);
        ticketBooks.add(ticketBook2);

        System.out.println(books);


        //Test insert book
        System.out.println("Đầu tiên test chức năng insert book nè ...");
        System.out.println("Nhập tên nhanh hộ cái:");
        String name= scanner.nextLine();
        System.out.println("Nhập tên tác giả đi:");
        String auth= scanner.nextLine();
        System.out.println("Rồi nhập tiêu đề đi:");
        String title= scanner.nextLine();
        BookModel model = new BookModel();
        Book book3 = new Book(3,name,auth,title,2);
        model.insert(book3,books);

        System.out.println(books);


        //Test update book
        System.out.println("Giờ test chức năng update book nè ...");
        System.out.println("Nhập tên nhanh hộ cái:");
        String name4= scanner.nextLine();
        System.out.println("Nhập tên tác giả đi:");
        String auth4= scanner.nextLine();
        System.out.println("Rồi nhập tiêu đề đi:");
        String title4= scanner.nextLine();
        Book book4 = new Book(3,name4,auth4,title4,4);
        model.update(book4,books);

        System.out.println(books);


        //Test delete book
        System.out.println("Giờ test chức năng delete chứ j ...");
        System.out.println("Nhập id muốn delete nào");
        int id = Integer.parseInt(scanner.nextLine());
        Book book5 = new Book(id);
        model.delete(book5, books);

        System.out.println(books);
        System.out.println(readers);

        //================================================
        //Test insert Reader
        System.out.println("Đầu tiên test chức năng insert Reader nè ...");
        System.out.println("Nhập tên nhanh hộ cái:");
        String nameR= scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address= scanner.nextLine();
        System.out.println("Rồi nhập số điện thoại:");
        String phone= scanner.nextLine();
        ReaderModel readerModel = new ReaderModel();
        Reader reader3 = new Reader(3,nameR,address,phone);
        readerModel.insert(reader3,readers);


        System.out.println(readers);


        //Test update reader
        System.out.println("Giờ test chức năng update reader nè ...");
        System.out.println("Nhập tên nhanh hộ cái:");
        String nameR3= scanner.nextLine();
        System.out.println("Nhập địa chỉ đi:");
        String address3= scanner.nextLine();
        System.out.println("Rồi nhập phone đi:");
        String phone3= scanner.nextLine();
        Reader reader4 = new Reader(3,nameR3,address3,phone3);
        readerModel.update(reader4,readers);


        System.out.println(readers);

        //Test delete reader
        System.out.println("Giờ test chức năng delete chứ j ...");
        System.out.println("Nhập id muốn delete nào");
        int idDel = Integer.parseInt(scanner.nextLine());
        Reader reader5 = new Reader(idDel);
        readerModel.delete(reader5, readers);


        System.out.println(readers);
        System.out.println(ticketBooks);

        //Test insert ticketBook

        Reader readerAddTicket = null;
        System.out.println("Đầu tiên test chức năng insert nè ...");
        System.out.println("Nhập id Reader");
        int idReader = Integer.parseInt(scanner.nextLine());
        for (Reader value : readers) {
            if (idReader == value.getId()) {
                readerAddTicket = value;
            }
        }
        Book bookAddTicket = null;
        System.out.println("Nhập id Book");
        int idBook = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < books.size(); i++) {
            if (idBook == books.get(i).getId() ){
                if (books.get(i).getNumberOfBook() != 0){
                    bookAddTicket = books.get(i);
                    books.get(i).setNumberOfBook((books.get(i).getNumberOfBook()-1));
                } else {
                    System.out.println("sách đã hết");
                }
            }
        }

        TicketBookModel ticketBookModel = new TicketBookModel();
        if (bookAddTicket != null && readerAddTicket != null){
            TicketBook ticketBook3 = new TicketBook(readerAddTicket,bookAddTicket);
            ticketBookModel.insert(ticketBook3,ticketBooks);
        } else {
            System.out.println(" chưa tạo đơn");
        }


        System.out.println(ticketBooks);

        //Xóa đơn
        System.out.println("Giờ test chức năng delete chứ j ...");
        System.out.println("Nhập id Reader");
        idReader = Integer.parseInt(scanner.nextLine());
        System.out.println("id book");
        idBook = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < ticketBooks.size(); i++) {
            if (ticketBooks.get(i).getReader().getId() == idReader
                    && ticketBooks.get(i).getBook().getId() == idBook){
                ticketBooks.remove(ticketBooks.get(i));
                for (Book book1: books){
                    if (book1.getId() == idBook){
                        book1.setNumberOfBook((book1.getNumberOfBook()+1));
                    }
                }
            }
        }
        System.out.println(ticketBooks);
    }
}
