package com.reto3.repository;

import java.util.List;
import java.util.Optional;
import com.reto3.intrface.CategoryInterface;
import com.reto3.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Oscar Alvarado
 */
@Repository
public class CategoryRepository {
    @Autowired
    private CategoryInterface categoryInterface;

    /**
     * Select
     * @return
     */
    public List<Category> getAll(){
        return (List<Category>) categoryInterface.findAll();
    }

    /**
     * Select by specific id
     * @param id
     * @return
     */
    public Optional<Category> getCategory(int id){
        return categoryInterface.findById(id);
    }

    /**
     * Insert
     * @param category
     * @return
     */
    public Category save(Category category){
        return categoryInterface.save(category);
    }

    /**
     * Delete
     * @param category
     */
    public void delete(Category category){
        categoryInterface.delete(category);
    }
}
