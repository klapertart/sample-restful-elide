package com.klapertart.elide.model;

import com.yahoo.elide.annotation.Include;

import javax.persistence.*;


@Entity
@Include(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private Category category;
}
