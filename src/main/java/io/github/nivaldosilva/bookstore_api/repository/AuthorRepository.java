package io.github.nivaldosilva.bookstore_api.repository;

import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.github.nivaldosilva.bookstore_api.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, UUID> {

}
