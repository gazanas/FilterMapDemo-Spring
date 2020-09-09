package com.filtermap.librarydemo.Repositories;

import com.filtermap.librarydemo.Entities.Information;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InformationRepository extends JpaRepository<Information, Integer> {

    @Query("SELECT DISTINCT i.genre FROM Information i")
    List<String> findDistinctGenres();
}
