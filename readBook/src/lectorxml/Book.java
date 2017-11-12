/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectorxml;



/**
 *
 * @author alvaropl
 */
public class Book {
    
    private String id;
    private String author;
    private String title;
    private String genre;
    private Double price;
    private String publish_data;
    private String description;
    
    public Book() {
    }

    public Book(String id, String author, String title, String genre, Double price, String publish_data, String description) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.publish_data = publish_data;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPublish_data() {
        return publish_data;
    }

    public void setPublish_data(String publish_data) {
        this.publish_data = publish_data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public String toString() {
        return "Book{" + "id=" + id + ", author=" + author + ", title=" + title + ", genre=" + genre + ", price=" + price + ", publish_data=" + publish_data + ", description=" + description + '}';
    } 
  
    
    
}
