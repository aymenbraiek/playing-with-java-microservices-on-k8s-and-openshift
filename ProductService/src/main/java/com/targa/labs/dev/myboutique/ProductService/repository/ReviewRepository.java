package com.targa.labs.dev.myboutique.ProductService.repository;

import com.targa.labs.dev.myboutique.ProductService.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
