package br.unitins.mobile.carcatalog.repository;

import br.unitins.mobile.carcatalog.model.Category;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CategoryRepository implements PanacheRepository<Category> {
}
