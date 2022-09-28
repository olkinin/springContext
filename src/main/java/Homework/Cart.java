package Homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {
    private ProductRepository productRepository;

    public Cart(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }


    public void addProduct(int id, String title, int price){

       productRepository.products.add(new Product(id, title, price));
       productRepository.findById(0);
         }
    public void deleteProduct(int id){

        productRepository.products.remove(id-1);
        productRepository.findById(0);
    }
}
