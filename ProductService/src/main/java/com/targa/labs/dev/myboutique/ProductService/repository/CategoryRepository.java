package com.targa.labs.dev.myboutique.ProductService.repository;

import com.targa.labs.dev.myboutique.ProductService.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
