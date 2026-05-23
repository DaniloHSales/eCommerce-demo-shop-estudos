package com.dailycodework.eCommercedemoshops.service.product;

import com.dailycodework.eCommercedemoshops.model.Product;
import com.dailycodework.eCommercedemoshops.requests.AddProductRequests;
import com.dailycodework.eCommercedemoshops.requests.ProductUpdateRequest;

import java.util.List;

public interface IProductService {

        Product addProduct(AddProductRequests product);

        Product getProductById(Long id);
        void deleteProductById(Long id);
        Product updateProductById(ProductUpdateRequest product, Long productId);

        List<Product> getAllProducts();
        List<Product> getProductsByCategory(String category);
        List<Product> getProductsByBrand(String brand);
        List<Product> getProductsByCategoryAndBrand(String category, String brand);
        List<Product> getProductsByName(String name);
        List<Product> getProductsByBrandAndName(String category, String name);

        Long countProductsByBrandAndName(String brand, String name);

}
