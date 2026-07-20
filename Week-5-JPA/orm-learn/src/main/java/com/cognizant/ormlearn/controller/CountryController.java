package com.cognizant.ormlearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

@RestController
@RequestMapping("/countries")
public class CountryController {

    @Autowired
    private CountryService countryService;

    // Get all countries
    @GetMapping
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    // Get all countries using HQL
    @GetMapping("/hql")
    public List<Country> getAllCountriesHQL() {
        return countryService.getAllCountriesHQL();
    }

    // Get country by code
    @GetMapping("/{code}")
    public Country getCountry(@PathVariable String code) {
        return countryService.getCountry(code);
    }

    // Add a new country
    @PostMapping
    public Country addCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }

    // Delete country
    @DeleteMapping("/{code}")
    public void deleteCountry(@PathVariable String code) {
        countryService.deleteCountry(code);
    }

    // Search countries containing the given text
    @GetMapping("/search/{text}")
    public List<Country> searchCountries(@PathVariable String text) {
        return countryService.searchCountries(text);
    }

    // Search countries containing the given text and sort by name
    @GetMapping("/searchsorted/{text}")
    public List<Country> searchCountriesSorted(@PathVariable String text) {
        return countryService.searchCountriesSorted(text);
    }

    // Get countries starting with a given alphabet
    @GetMapping("/starts/{alphabet}")
    public List<Country> countriesStartingWith(@PathVariable String alphabet) {
        return countryService.countriesStartingWith(alphabet);
    }
}