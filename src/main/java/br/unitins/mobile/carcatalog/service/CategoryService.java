package br.unitins.mobile.carcatalog.service;

import br.unitins.mobile.carcatalog.model.Category;
import br.unitins.mobile.carcatalog.repository.CategoryRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.List;

@ApplicationScoped
public class CategoryService {

    @Inject
    CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.listAll();
    }
}
