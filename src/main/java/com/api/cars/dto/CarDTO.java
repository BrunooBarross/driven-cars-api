package com.api.cars.dto;

import java.util.Date;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;

public record CarDTO(
                @NotBlank(message = "Não pode ser vazio")
                String modelo,
                @NotBlank (message = "Fabrincante não pode ser vazio")
                String fabricante,
                @Past (message = "Deve seguir o padrão americano 'dd-MM-yyyy' e deve ser anterior a data atual")
                Date dataFabricacao,
                @NotNull 
                Double valor,
                @NotNull @Min(value = 1950) @Max(value = 2024) 
                Integer anoModelo) {

}