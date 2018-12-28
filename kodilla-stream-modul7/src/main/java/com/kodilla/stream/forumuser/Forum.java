package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    List<ForumUser> userList = new ArrayList<>();

    public Forum(){
        userList.add(new ForumUser(1, "Adam", 1997, 12,13, 'M', 13));
        userList.add(new ForumUser(2, "Bartek", 1990, 2,10, 'M', 4));
        userList.add(new ForumUser(3, "Cecylia", 1987, 4,11, 'F', 0));
        userList.add(new ForumUser(4, "Darek", 1981, 1, 19, 'M', 2));
        userList.add(new ForumUser(5, "Ewa", 1999, 10,26, 'F', 8));
        userList.add(new ForumUser(6, "Felek", 2000, 9, 13, 'M', 19));
        userList.add(new ForumUser(7, "Gienia", 2001, 10, 11, 'F', 0));
        userList.add(new ForumUser(8, "Henio", 1999, 11, 21, 'M', 2));
        userList.add(new ForumUser(9, "Iza", 1999, 5, 5, 'F', 3));
        userList.add(new ForumUser(10, "Justyna", 1998, 1, 5, 'M', 53));
        userList.add(new ForumUser(11, "Krzys", 1997, 5,12, 'M', 0));
        userList.add(new ForumUser(12, "Leon", 1996, 8,9, 'M', 10));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
