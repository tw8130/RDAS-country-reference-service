package com.loopdfs.rdas.dto;

public record CountryDto(
        String countryName,
        String capitalCity,
        String continent,
        String currencyCode,
        String currencyName,
        String language,
        String dialingCode,
        String flagUrl
) {
}

