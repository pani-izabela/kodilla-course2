package com.kodilla.stream;

import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
//        People.getList().stream()
//                .map(s->s.toUpperCase())
//                .filter(s->s.length()>11)
//                .map(s->s.substring(0, s.indexOf(' ') + 2) + ".")
//                .filter(s->s.substring(0,1).equals("M"))
//                .forEach(System.out::println);

//        BookDirectory theBookDirectory = new BookDirectory();
//        Map<String, Book> theResultMapOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication()>2005)
//                .collect(Collectors.toMap(book->book.getSignature(), book -> book));
//
//        System.out.println("# elements: " + theResultMapOfBooks.size());
//        theResultMapOfBooks.entrySet().stream()
//                .map(entry -> entry.getKey() + ": " + entry.getValue())

//        BookDirectory theBookDirectory = new BookDirectory();
//        String theResultStringOfBooks = theBookDirectory.getList().stream()
//                .filter(book -> book.getYearOfPublication() > 2005)
//                .map(Book::toString)
//                .collect(Collectors.joining(",\n","<<",">>"));
//        System.out.println(theResultStringOfBooks);

        Forum forum  = new Forum();
        Map<Integer, ForumUser> map = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex()=='M')
                .filter(forumUser -> forumUser.getDateOfBirth().getYear()<1998)
                .filter(forumUser -> forumUser.getQuantityOfPosts()>0)
                .collect(Collectors.toMap(forumUser -> forumUser.getId(), forumUser -> forumUser));
                //.forEach(System.out::println);
        System.out.println(map);
    }
}
