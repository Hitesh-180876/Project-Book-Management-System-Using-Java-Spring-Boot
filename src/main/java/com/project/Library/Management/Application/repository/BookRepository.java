package com.project.Library.Management.Application.repository;

import com.project.Library.Management.Application.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
