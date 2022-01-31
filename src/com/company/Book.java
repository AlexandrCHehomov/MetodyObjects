package com.company;

import java.util.Objects;

public class Book {
    private final String nameBook;
    private final Author fullName;

    @Override
    public int hashCode() {
        return Objects.hash(nameBook, fullName, yearPublications);
    }

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

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book onebook = (Book) other;
        return nameBook.equals(onebook.nameBook);
    }
//

}
