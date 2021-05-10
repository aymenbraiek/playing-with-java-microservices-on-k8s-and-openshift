package com.targa.labs.dev.myboutique.ProductService.web;

import com.targa.labs.dev.myboutique.ProductService.service.ProductService;
import com.targa.labs.dev.myboutique.myboutique.commons.dto.ProductDto;
import com.targa.labs.dev.myboutique.myboutique.commons.utils.Web;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author n.lamouchi
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(Web.API + "/products")
public class ProductResource {

    private final ProductService productService;

    @GetMapping
    public List<ProductDto> findAll() {
        return this.productService.findAll();
    }

    @GetMapping("/{id}")
    public ProductDto findById(@PathVariable Long id) {
        return this.productService.findById(id);
    }

    @PostMapping
    public ProductDto create(@RequestBody ProductDto productDto) {
        return this.productService.create(productDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.productService.delete(id);
    }
}
