package com.loopdfs.rdas.service;

import com.loopdfs.rdas.dto.CountryDto;
import com.loopdfs.rdas.dto.PageResponse;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryServiceImpl implements CountryService {

    @Override
    public PageResponse<CountryDto> searchCountries(
            String name,
            String continent,
            String currency,
            String language,
            int page,
            int size,
            String sortBy,
            String sortDir) {

        List<CountryDto> countries =
                List.of(
                        new CountryDto(
                                "Kenya",
                                "Nairobi",
                                "Africa",
                                "KES",
                                "Kenyan Shilling",
                                "English",
                                "+254",
                                "flag-url"
                        )
                );

        return new PageResponse<>(
                countries,
                0,
                20,
                countries.size(),
                1,
                false
        );
    }

    @Override
    public CountryDto getCountryDetails(String countryName) {

        return new CountryDto(
                "Kenya",
                "Nairobi",
                "Africa",
                "KES",
                "Kenyan Shilling",
                "English",
                "+254",
                "flag-url"
        );
    }

    @Override
    public List<CountryDto> getCountriesByCurrency(
            String currencyCode) {

        return List.of(
                getCountryDetails("Kenya")
        );
    }
}