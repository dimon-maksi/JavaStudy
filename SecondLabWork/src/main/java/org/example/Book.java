package org.example;

public class Book extends Item{

    private String autor;
    @Override
    void borrowItem() {
        setBorrowed(true);
    }

    @Override
    void returnItem() {
        setBorrowed(false);
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
