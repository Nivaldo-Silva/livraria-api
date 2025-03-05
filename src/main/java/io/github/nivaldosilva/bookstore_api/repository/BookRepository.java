package io.github.nivaldosilva.bookstore_api.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.github.nivaldosilva.bookstore_api.model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,UUID>{

}
