package com.klapertart.elide.repository;

import com.klapertart.elide.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author tritronik
 * @since 7/19/2024
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
