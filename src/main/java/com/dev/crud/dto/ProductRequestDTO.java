package com.dev.crud.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


public record ProductRequestDTO(
    @NotBlank (message="O nome é obrigatório")
    @Size(min = 3, max = 100, message = "O nome deve ter entre 3 e 100 caracteres")
    String name,

    @NotNull(message = "O preço é obrigatório")
    @Positive(message="O preço deve ser um valor positivo")
    Double price
) {}