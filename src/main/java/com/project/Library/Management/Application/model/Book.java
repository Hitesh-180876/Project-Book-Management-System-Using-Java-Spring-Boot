package com.project.Library.Management.Application.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor

@Table(name = "book", uniqueConstraints = @UniqueConstraint(name = "id", columnNames = "book_id"))
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "book_id")
    private int id;

    @Column(name = "book_title")
    private String title;

    @Column(name = "book_author")
    private String author;

    @Column(name = "book_subject")
    private String subject;


}
