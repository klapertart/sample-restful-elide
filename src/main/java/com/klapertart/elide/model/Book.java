package com.klapertart.elide.model;

import com.yahoo.elide.annotation.Include;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author kurakuraninja
 * @since 17/07/24
 */

@Entity(name = "book")
@Include(name = "book")
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String author;

    // Getters and setters
}