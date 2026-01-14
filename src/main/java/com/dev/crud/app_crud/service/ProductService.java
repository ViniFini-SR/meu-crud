package com.dev.crud.app_crud.service;

import com.dev.crud.app_crud.model.Product;
import com.dev.crud.app_crud.dto.ProductRequestDTO;
import com.dev.crud.app_crud.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // Avisar que aqui tem lógicas de negócio
@RequiredArgsConstructor // Construtor para injeção auto de dependencias do ProductRepository
public class ProductService {
    
    private final ProductRepository repository;

    public List<Product> findall() {
        return repository.findAll();
    }

    public Product save(ProductRequestDTO dto) {
        Product product = new Product();
        product.setName(dto.name());
        product.setPrice(dto.price());

        return repository.save(product);
    }

    public Product update(Long id, ProductRequestDTO dto) {
        Product product = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Produto não localizado com id: " + id));
        
        product.setName(dto.name());
        product.setPrice(dto.price());
        
        return repository.save(product);
    }

    public void delete(Long id) {
        Product product = repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Deleção não realizara. Produto não encontrato com id: " + id));
        
        repository.delete(product);
    }

}
