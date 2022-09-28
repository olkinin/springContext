package Homework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("Homework");
        ProductRepository productRepository=context.getBean(ProductRepository.class);
        productRepository.findById(4);
        Cart cart=context.getBean(Cart.class);
        cart.addProduct(6,"water",10);
        cart.addProduct(7,"potato",150);
        cart.deleteProduct(6);




    }
}
