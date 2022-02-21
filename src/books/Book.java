/*
 * @autor Francisco Bañuelos.
 */
package trucos.books;

class Book {
    int isbn;
    String title, author;
    float price;
    double discount;

    public Book(int isbn, String title, String author, float price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void displaydetails(){
        System.out.println("ISBN : "+ this.isbn);
        System.out.println("Title : "+ this.title);
        System.out.println("Author : "+ this.author);
        System.out.println("price : "+ this.price);
    }
    void discountedprice(){
        discount =  price - (price*.20);
        System.out.println( "Subtotal"+"Total"+discount);
    }
}
class BookMain{
    public static void main(String []args){
        Book book = new Book(235235,"thehdjs","hdhdhd",500);
        book.displaydetails();
        book.discountedprice();

    }
}