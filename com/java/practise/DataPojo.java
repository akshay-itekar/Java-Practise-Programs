package com.java.practise;


public class DataPojo {

    int id;

    String bookName;
    String name;

    public DataPojo(int id, String bookName, String name) {
        this.id = id;
        this.bookName = bookName;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "DataPojo{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
