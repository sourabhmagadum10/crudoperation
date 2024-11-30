package Service;

import Entity.ProductEntity;
import Repository.CategoryRepo;
import Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServi {
    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private CategoryRepo categoryRepo;

//    public Page<ProductEntity> getProducts(int page, int size) {
//        return productRepo.findAll(PageRequest.of(page, size));
//    }

    public ProductEntity createProduct(ProductEntity product) {
        return productRepo.save(product);
    }

    public ProductEntity getProductById(Long id) {
        return productRepo.findById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public ProductEntity updateProduct(Long id, ProductEntity productDetails) {
        ProductEntity product = getProductById(id);
        product.setName(productDetails.getName());
        product.setPrice(productDetails.getPrice());
//        product.setCategory(productDetails.getCategory());
        return productRepo.save(product);
    }

    public void deleteProduct(Long id) {
        productRepo.deleteById(id);
    }

}
