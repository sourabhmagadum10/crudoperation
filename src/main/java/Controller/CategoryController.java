package Controller;

import Entity.CategoryEntity;
import Service.CategoryServi;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestContoller
public class CategoryController {
    private CategoryServi categoryServi;
//    @GetMapping
//    public Page<CategoryEntity> getCategories(@RequestParam int page, @RequestParam int size) {
//        return categoryServi.getCategories(page, size);
//    }
    @PostMapping
    public CategoryEntity createCategory(@RequestBody CategoryEntity category) {
        return categoryServi.createCategory(category);
    }
    @GetMapping("/{id}")
    public CategoryEntity getCategoryById(@PathVariable Long id) {
        return (CategoryEntity) categoryServi.getCategoryById(id);
    }
    @PutMapping("/{id}")
    public CategoryEntity updateCategory(@PathVariable Long id, @RequestBody CategoryEntity categoryDetails) {
        return categoryServi.updateCategory(id, categoryDetails);
    }
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryServi.deleteCategory(id);
    }
}
