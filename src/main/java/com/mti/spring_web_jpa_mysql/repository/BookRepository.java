package com.mti.spring_web_jpa_mysql.repository;

import com.mti.spring_web_jpa_mysql.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
