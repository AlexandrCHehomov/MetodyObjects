package com.company;

import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Author fullName;

    @Override
    public String toString() {
            return "Название книги - " + this.nameBook + ", имя автора - " + this.fullName + ", дата публикации - " + this.yearPublications;

    }

    private int yearPublications;
    public Book(String nameBook, Author fullName, int yearPublications) {
        this.nameBook = nameBook;
        this.fullName = fullName;
        this.yearPublications = yearPublications;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getFullName() {
        return this.fullName;
    }

    public int getYearPublications() {
        return this.yearPublications;
    }

    public void setYearPublications(int yearPublications) {
        this.yearPublications = yearPublications;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return yearPublications == book.yearPublications && nameBook.equals(book.nameBook) && fullName.equals(book.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, fullName, yearPublications);
    }
}
