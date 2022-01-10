package com.umutyildiz.Bas.business.concretes;

import com.umutyildiz.Bas.business.abstracts.CategoryService;
import com.umutyildiz.Bas.dataAccess.abstracts.CategoryDao;
import com.umutyildiz.Bas.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public void createCategory(Category category) {
        categoryDao.save(category);
    }
}
