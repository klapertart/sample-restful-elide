package com.klapertart.elide.repository;

import com.klapertart.elide.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tritronik
 * @since 7/19/2024
 */
public interface ProductRepository extends JpaRepository<Product, Long> {
}
