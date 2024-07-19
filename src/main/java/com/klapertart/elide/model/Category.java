package com.klapertart.elide.model;

import com.yahoo.elide.annotation.Include;

import javax.persistence.*;
import java.util.List;

@Entity
@Include(name = "category")
public class Category{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
