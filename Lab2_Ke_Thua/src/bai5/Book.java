/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author C
 */
public class Book {

    private String bookName;
    private String bookAuthor;
    private String producer;
    private int yearPublishing;
    private float price;

    public Book() {
    }

    public Book(String bookName, String bookAuthor, String producer, int yearPublishing, float price) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.producer = producer;
        this.yearPublishing = yearPublishing;
        this.price = price;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" + "bookName=" + bookName + ", bookAuthor=" + bookAuthor + ", producer=" + producer + ", yearPublishing=" + yearPublishing + ", price=" + price + '}';
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách: ");
        this.bookName = sc.nextLine();
        System.out.print("Nhập tên tác giả: ");
        this.bookAuthor = sc.nextLine();
        System.out.print("Nhập nhà sản xuất: ");
        this.producer = sc.nextLine();
        System.out.print("Nhập năm xuất bản: ");
        this.yearPublishing = sc.nextInt();
        System.out.print("Nhập giá bán: ");
        this.price = sc.nextFloat();
    }
    
    public void hienthi(){
        System.out.println("Tên sách: "+bookName);
        System.out.println("Tên tác giả: "+bookAuthor);
        System.out.println("Nhà sản xuất: "+producer);
        System.out.println("Năm xuất bản: "+yearPublishing);
        System.out.println("Giá bán: "+price);
    }
}
