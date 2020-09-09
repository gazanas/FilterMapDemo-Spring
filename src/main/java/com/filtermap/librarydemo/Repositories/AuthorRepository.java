package com.filtermap.librarydemo.Repositories;

import com.filtermap.librarydemo.Entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

    @Query("SELECT DISTINCT a.name FROM Author a")
    List<String> findDistinctAuthors();
}
