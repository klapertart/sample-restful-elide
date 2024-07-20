package com.klapertart.elide.model;

import com.yahoo.elide.annotation.Include;
import com.yahoo.elide.annotation.ReadPermission;

import javax.persistence.*;
import java.util.List;

@Entity
@Include(name = "category")
@ReadPermission(expression = "Prefab.Role.All")  // Allow read access to everyone
public class Category{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
