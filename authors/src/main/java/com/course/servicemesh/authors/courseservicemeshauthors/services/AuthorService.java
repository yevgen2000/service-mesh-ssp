package com.course.servicemesh.authors.courseservicemeshauthors.services;

import com.course.servicemesh.authors.courseservicemeshauthors.models.Author;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;

@Component
public class AuthorService {
    private final HashMap<Integer, Author> authors;

    public AuthorService() {
        this.authors = new HashMap<>();
        this.authors.put(1, new Author(1).withFirstName("Loreth Anne").withLastName("White"));
        this.authors.put(2, new Author(2).withFirstName("Lisa").withLastName("Regan"));
        this.authors.put(3, new Author(3).withFirstName("Ty").withLastName("Patterson"));
    }

    public Collection<Author> getAuthors() {
        return this.authors.values();
    }

    public Author findById(int id) {
        return this.authors.get(id);
    }
}
