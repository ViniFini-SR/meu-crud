package com.dev.crud.app_crud.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public record ProductRequestDTO(
    @NotBlank String name,
    @Positive Double price
) {}
