package com.company.comparable;

public class Book implements Comparable<Book> {
    private Integer bookId;
    private String bookName;
    private Double price;

    public Book() {
    }

    public Book(Integer bookId, String bookName, Double price) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.price = price;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }


    @Override
    public int compareTo(Book book) {
        if (this.price == book.price) {
            return 0;
        } else if (this.price < book.price) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", price=" + price +
                '}';
    }
}
