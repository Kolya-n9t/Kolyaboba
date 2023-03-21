package AllDZ;

import java.util.ArrayList;
import java.util.List;

public class Main3000iQ {

    static List<Book>books = new ArrayList<>();
    static List<Employee>employees = new ArrayList<>();
    static List<Customer>customers = new ArrayList<>();
    static List<Order>orders = new ArrayList<>();

    public static void main(String[] args){
        initDate();
        int a = getCountOfSoldBooks();
        double b = getPriceOfAllOrders();
        System.out.println("Кількість проданих книжок " + a);
        System.out.println("Продано книжок на суму " + b);

        getNameAndAuthorInfo();
    }
    public static Book getBookById(long id){
        Book current = null;
        for(Book book : books){
            if (book.getId()==id){
                current = book;
            }
        }
        return current;
    }
    public static int getCountOfSoldBooks(){
        int count = 0;
        for (Order order : orders){
            count += order.getBooks().length;
        }
        return count;
    }
    public static double getPriceOfSoldBooksInOrder(Order order){
        double price = 0;
        for (long bookId : order.getBooks()){
            Book book = getBookById(bookId);
            if (book!=null){
                price+=book.getPrise();
            }
        }
        return price;
    }
    public static double getPriceOfAllOrders(){
        double price = 0;
        for (Order orders : orders){
            if (orders!=null){
                price += getPriceOfSoldBooksInOrder(orders);
            }
        }
        return price;
    }

    public static void getNameAndAuthorInfo(){
        for (Book book : books){
            System.out.println("Книга " + book.getName());
            System.out.println("Aвтор " + book.getAuthor());
        }
    }


    public static void initDate(){
        employees.add(new Employee(1, "Lola", 20));
        employees.add(new Employee(2, "Mr Potato", 22));
        employees.add(new Employee(3, "Sasha", 25));

        customers.add(new Customer(1, "Suu!!!", 15));
        customers.add(new Customer(2, "MoreMack", 42));
        customers.add(new Customer(3, "Lu", 54));
        customers.add(new Customer(4, "Ilan", 19));
        customers.add(new Customer(5, "Tesla", 35));

        books.add(new Book(1, "Harry Potter and the Philosopher's Stone", "Joanne Rowling", 150, BookGenre.FANTASTIC));
        books.add(new Book(2, "Harry Potter And The Chamber of secrets", "Joanne Rowling", 200, BookGenre.FANTASTIC));
        books.add(new Book(3, "Harry Potter and the prisoner of Azkaban", "Joanne Rowling", 250, BookGenre.FANTASTIC));
        books.add(new Book(4, "Harry Potter and the Goblet of Fire", "Joanne Rowling", 300, BookGenre.FANTASTIC));
        books.add(new Book(5, "Harry Potter and the Order of the Phoenix", "Joanne Rowling", 350, BookGenre.FANTASTIC));
        books.add(new Book(6, "Harry Potter and the Half-Blood Prince", "Joanne Rowling", 400, BookGenre.FANTASTIC));
        books.add(new Book(7, "Harry Potter and the Deathly Hallows", "Joanne Rowling", 450, BookGenre.FANTASTIC));
        books.add(new Book(8, "Harry Potter and the Cursed Child", "Joanne Rowling", 500, BookGenre.FANTASTIC));
        books.add(new Book(9, "Romeo and Juliet", "William Shakespeare", 480, BookGenre.ROMANE));
        books.add(new Book(10, "Masters and masterpieces", "Leonardo da Vinci", 170, BookGenre.ART));

        orders.add(new Order(1, 1, 1, new long[]{7, 8, 9}));
        orders.add(new Order(2, 3, 1, new long[]{1}));
        orders.add(new Order(3, 2, 4, new long[]{1, 2, 3}));
        orders.add(new Order(4, 3, 5, new long[]{10, 3, 7, 12}));
        orders.add(new Order(5, 4, 6, new long[]{2, 5}));
    }



}
