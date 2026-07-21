package com.cognizant.springlearn.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springlearn.exception.CountryNotFoundException;
import com.cognizant.springlearn.model.Country;

@RestController
public class CountryController {

    private static List<Country> countries = new ArrayList<>();

    static {
        countries.add(new Country("IN", "India"));
        countries.add(new Country("US", "United States"));
        countries.add(new Country("JP", "Japan"));
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countries;
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() ->
                        new CountryNotFoundException("Country not found: " + code));
    }

    @PostMapping("/countries")
    public Country addCountry(@RequestBody Country country) {
        countries.add(country);
        return country;
    }
}