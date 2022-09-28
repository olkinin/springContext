package Homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("Homework");
        ProductRepository productRepository=context.getBean(ProductRepository.class);
        productRepository.findById(3);
        Cart cart=context.getBean(Cart.class);
        cart.addProduct(6,"water",10);
        cart.addProduct(7,"sugar",150);
        cart.deleteProduct(5);




    }
}
