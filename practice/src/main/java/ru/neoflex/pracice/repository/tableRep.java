package ru.neoflex.pracice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.neoflex.pracice.database.table;

import java.util.List;

@Repository
public interface tableRep extends JpaRepository<table, Long> {
    @Query("SELECT r.result FROM table r")
    List<Integer> findAllResultsOnly();

}
