package com.dev.crud.controller;

import com.dev.crud.model.Product;
import com.dev.crud.dto.ProductRequestDTO;
import com.dev.crud.service.ProductService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // aqui faz com que as respostas dos methods sejam em json
@RequestMapping("/api/products") // Defino o caminho da request no endpoint
@RequiredArgsConstructor
public class ProductController {
    
    private final ProductService service;

    @GetMapping
    public List<Product> getAll() {
        return service.findall();
    }

    @PostMapping
    public Product create(@RequestBody @Valid ProductRequestDTO dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    public Product update(@PathVariable Long id, @RequestBody @Valid ProductRequestDTO dto) {
        return service.update(id, dto);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(org.springframework.http.HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}
