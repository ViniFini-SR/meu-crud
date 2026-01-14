package com.dev.crud.app_crud.repository;

import com.dev.crud.app_crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
// Recebe as funções de do JpaRepository, com o type da classe Product e o Id dela que é Long
// é o spring que "escreve" os camandos sql aqui