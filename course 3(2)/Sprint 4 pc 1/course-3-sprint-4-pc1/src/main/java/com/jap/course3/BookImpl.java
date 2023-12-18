package com.jap.course3;

public class BookImpl {
    public static void main(String args[]){
        Author a=new Author();
        a.setAuthorName("shetty");
        a.setAuthorPenName("jai");
        Book b=new Book();
        b.setIsbnNumber(123344);
        b.setBookTitle("Think like a monk");
        b.setBookDescription("XYz");
        b.setPrice(234);
        b.setAuthor(a);
        b.displayBookDetails();
    }
}
