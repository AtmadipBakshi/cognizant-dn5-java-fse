package com.cognizant.ormlearn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cognizant.ormlearn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    List<Country> findByNameContainingIgnoreCase(String text);

    List<Country> findByNameContainingIgnoreCaseOrderByNameAsc(String text);

    List<Country> findByNameStartingWithIgnoreCase(String alphabet);

    // HQL Query
    @Query("SELECT c FROM Country c")
    List<Country> getAllCountriesHQL();

}