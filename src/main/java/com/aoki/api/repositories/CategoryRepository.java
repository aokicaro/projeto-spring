package com.aoki.api.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.aoki.api.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {}
