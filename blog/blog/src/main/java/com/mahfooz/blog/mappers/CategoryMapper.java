package com.mahfooz.blog.mappers;

import com.mahfooz.blog.domain.dtos.CategoryDto;
import com.mahfooz.blog.domain.dtos.CreateCategoryRequest;
import com.mahfooz.blog.domain.entities.Category;

public interface CategoryMapper {

    CategoryDto toDto(Category category);

    Category toEntity(CreateCategoryRequest createCategoryRequest);

}
