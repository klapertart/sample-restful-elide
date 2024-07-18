package com.klapertart.elide.repository;

import com.klapertart.elide.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author kurakuraninja
 * @since 17/07/24
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
