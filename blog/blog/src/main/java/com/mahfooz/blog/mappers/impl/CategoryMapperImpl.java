package com.mahfooz.blog.mappers.impl;

import com.mahfooz.blog.domain.dtos.CategoryDto;
import com.mahfooz.blog.domain.dtos.CreateCategoryRequest;
import com.mahfooz.blog.domain.entities.Category;
import com.mahfooz.blog.mappers.CategoryMapper;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapperImpl implements CategoryMapper {

    @Override
    public CategoryDto toDto(Category category) {
        return CategoryDto.builder()
                .name(category.getName())
                // all values
                .build();
    }

    @Override
    public Category toEntity(CreateCategoryRequest createCategoryRequest) {
        return null;
    }
}
