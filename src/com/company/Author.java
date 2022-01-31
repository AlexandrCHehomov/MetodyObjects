package com.company;

import java.util.Objects;

public class Author {
    private final String name;
    private final String lastname;

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname);
    }

    public Author (String name, String lastname) {
        this.name = name;
        this.lastname = lastname;
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

    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Author Pushkin = (Author) other;
        return lastname.equals(Pushkin.lastname);
    }
//
}
