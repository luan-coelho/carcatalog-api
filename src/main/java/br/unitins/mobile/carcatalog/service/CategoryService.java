package br.unitins.mobile.carcatalog.service;

import br.unitins.mobile.carcatalog.model.Category;

import javax.annotation.PostConstruct;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CategoryService {

    List<Category> categories = new ArrayList<>();

    @PostConstruct
    public void init() {
        Category sedan = new Category(1, "Sedan");
        Category suv = new Category(2, "SUV");
        Category hatchback = new Category(3, "Hatchback");

        categories.add(sedan);
        categories.add(suv);
        categories.add(hatchback);
    }

    public List<Category> getAll() {
        return categories;
    }
}
