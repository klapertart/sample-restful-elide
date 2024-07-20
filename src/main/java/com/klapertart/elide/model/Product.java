package com.klapertart.elide.model;

import com.yahoo.elide.annotation.Include;
import com.yahoo.elide.annotation.ReadPermission;

import javax.persistence.*;


@Entity
@Include(name = "product")
@ReadPermission(expression = "Prefab.Role.All")  // Allow read access to everyone
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double price;

    @ManyToOne
    @JoinColumn(name = "category",nullable = false)
    private Category category;
}
