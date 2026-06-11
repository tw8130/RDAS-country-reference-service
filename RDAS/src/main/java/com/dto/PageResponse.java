package com.loopdfs.rdas.dto;

import java.util.List;

public record PageResponse<T>(
        List<T> data,
        int pageNumber,
        int pageSize,
        long totalElements,
        int totalPages,
        boolean hasNext
) {
}