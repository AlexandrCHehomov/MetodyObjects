package com.company;

import java.util.Objects;

public class Author {
    private final String name;
    private final String lastname;

    public Author (String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return name.equals(author.name) && lastname.equals(author.lastname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Имя автора - " + this.name + ", фамилия автора - " + this.lastname;
    }

    public String getLastname() {
        return this.lastname;
    }

}
