package com.klapertart.elide.model;

import com.yahoo.elide.annotation.Include;

import javax.persistence.*;

/**
 * @author kurakuraninja
 * @since 17/07/24
 */

@Entity
@Include(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;
}
