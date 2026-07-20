package com.cognizant.ormlearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    // Get all countries
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // Get all countries using HQL
    public List<Country> getAllCountriesHQL() {
        return countryRepository.getAllCountriesHQL();
    }

    // Get country by code
    public Country getCountry(String code) {
        return countryRepository.findById(code).orElse(null);
    }

    // Add/Update country
    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    // Delete country
    public void deleteCountry(String code) {
        countryRepository.deleteById(code);
    }

    // Search countries containing text
    public List<Country> searchCountries(String text) {
        return countryRepository.findByNameContainingIgnoreCase(text);
    }

    // Search countries containing text and sort by name
    public List<Country> searchCountriesSorted(String text) {
        return countryRepository.findByNameContainingIgnoreCaseOrderByNameAsc(text);
    }

    // Search countries starting with a letter
    public List<Country> countriesStartingWith(String alphabet) {
        return countryRepository.findByNameStartingWithIgnoreCase(alphabet);
    }
}