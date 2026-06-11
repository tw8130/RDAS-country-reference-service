package com.loopdfs.rdas.controller;

import com.loopdfs.rdas.dto.CountryDto;
import com.loopdfs.rdas.dto.PageResponse;
import com.loopdfs.rdas.service.CountryService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries")
    public ResponseEntity<PageResponse<CountryDto>> searchCountries(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String continent,
            @RequestParam(required = false) String currency,
            @RequestParam(required = false) String language,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "20") int size,
            @RequestParam(defaultValue = "countryName") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir) {

        return ResponseEntity.ok(
                countryService.searchCountries(
                        name,
                        continent,
                        currency,
                        language,
                        page,
                        size,
                        sortBy,
                        sortDir
                )
        );
    }

    @GetMapping("/countries/{countryName}")
    public ResponseEntity<CountryDto> getCountry(
            @PathVariable String countryName) {

        return ResponseEntity.ok(
                countryService.getCountryDetails(countryName)
        );
    }

    @GetMapping("/currencies/{currencyCode}/countries")
    public ResponseEntity<List<CountryDto>> getCountriesByCurrency(
            @PathVariable String currencyCode) {

        return ResponseEntity.ok(
                countryService.getCountriesByCurrency(currencyCode)
        );
    }
}