package com.targa.labs.dev.myboutique.ProductService.web;

import com.targa.labs.dev.myboutique.ProductService.service.CategoryService;
import com.targa.labs.dev.myboutique.myboutique.commons.dto.CategoryDto;
import com.targa.labs.dev.myboutique.myboutique.commons.utils.Web;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author n.lamouchi
 */
@RequiredArgsConstructor
@RestController
@RequestMapping(Web.API + "/categories")
public class CategoryResource {

    private final CategoryService categoryService;

    @GetMapping
    public List<CategoryDto> findAll() {
        return this.categoryService.findAll();
    }

    @GetMapping("/{id}")
    public CategoryDto findById(@PathVariable Long id) {
        return this.categoryService.findById(id);
    }

    @PostMapping
    public CategoryDto create(CategoryDto categoryDto) {
        return this.categoryService.create(categoryDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        this.categoryService.delete(id);
    }
}
