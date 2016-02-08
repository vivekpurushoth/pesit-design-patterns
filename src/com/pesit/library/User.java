package com.pesit.library;

/**
 * Created by vp2 on 06/02/16.
 */
public abstract class User {
    private String type;

    private String Name;

    private int id;

    private String phoneNumber;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Book[] getHistory() {
        return History;
    }

    public void setHistory(Book[] history) {
        History = history;
    }

    private String Password;

    private Book[] History;

    private Book[] currentBooks;
}
