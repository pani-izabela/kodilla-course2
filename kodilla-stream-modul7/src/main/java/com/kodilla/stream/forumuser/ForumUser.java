package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int id;
    private final String nameUser;
    private final LocalDate dateOfBirth;
    private char sex = 'M'/'F';
    private final int quantityOfPosts;

    public ForumUser(final int id, final String nameUser, final int yearOfBirth,
                     final int monthOfBirth, final int dayOfBirth, char sex, final int quantityOfPosts) {
        this.id = id;
        this.nameUser = nameUser;
        this.sex = sex;
        this.dateOfBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.quantityOfPosts = quantityOfPosts;
    }

    public int getId() {
        return id;
    }

    public String getNameUser() {
        return nameUser;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "id=" + id +
                ", nameUser='" + nameUser + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", sex=" + sex +
                ", quantityOfPosts=" + quantityOfPosts +
                '}';
    }
}
