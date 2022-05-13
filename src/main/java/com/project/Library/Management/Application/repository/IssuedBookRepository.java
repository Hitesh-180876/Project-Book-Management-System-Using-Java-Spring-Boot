package com.project.Library.Management.Application.repository;

import com.project.Library.Management.Application.model.IssuedBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssuedBookRepository extends JpaRepository<IssuedBook, Integer> {
}
