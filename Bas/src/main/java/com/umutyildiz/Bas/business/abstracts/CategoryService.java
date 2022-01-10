package com.umutyildiz.Bas.business.abstracts;

import com.umutyildiz.Bas.entities.concretes.Category;
import org.springframework.web.bind.annotation.RequestBody;

public interface CategoryService {
    void createCategory(Category category);
}
