package com.pesit.library;

/**
 * Created by vp2 on 06/02/16.
 */
public class Book {

    public Book() {

    }

    public Book(int id, String title, String authorName) {
        this.id = id;
        this.Title = title;
        this.authorName = authorName;
    }

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getPublisher_Name() {
        return Publisher_Name;
    }

    public void setPublisher_Name(String publisher_Name) {
        Publisher_Name = publisher_Name;
    }

    public String getEdition() {
        return Edition;
    }

    public void setEdition(String edition) {
        Edition = edition;
    }

    private String Title;

    private String Publisher_Name;

    private String Edition;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    private String authorName;
}
