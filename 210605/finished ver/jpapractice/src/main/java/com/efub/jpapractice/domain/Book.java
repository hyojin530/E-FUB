package com.efub.jpapractice.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@Entity
public class Book extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String category;

    @OneToMany(mappedBy = "book")
    @ToString.Exclude
    private List<BookReview> bookReviews = new ArrayList<>();

    @ManyToMany
    private List<Author> authors = new ArrayList<>();

    public void addAuthor(Author... author){
        Collections.addAll(this.authors, author);
    }
}
