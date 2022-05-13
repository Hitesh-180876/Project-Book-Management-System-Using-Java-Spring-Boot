package com.project.Library.Management.Application.model;

import lombok.*;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

@Table(name = "issued_book")
public class IssuedBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "user_id")
    private int user_id;

    @Column(name = "book_id")
    private int book_id;

    @Column(name = "book_status")
    private String status;


}
