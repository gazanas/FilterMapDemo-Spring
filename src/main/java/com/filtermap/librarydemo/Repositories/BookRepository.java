package com.filtermap.librarydemo.Repositories;

import com.filtermap.librarydemo.Entities.Book;
import org.filtermap.FilterMapSort;
import org.filtermap.annotations.Filter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    @Query("SELECT b.title FROM Book b")
    List<String> findAllTitles();

    @Query("SELECT b.published FROM Book b")
    List<Integer> findAllPublished();

    @Filter
    List<Book> filterBooks(Map book);

    @Filter
    List<Book> filterAndSortBooks(Map book, FilterMapSort sort);
}
