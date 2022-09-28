package Homework;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component

public class ProductRepository {
    public List<Product> products;



    @PostConstruct
    public void init() {
        products = new ArrayList<Product>(Arrays.asList(
                new Product(1, "milk", 100),
                new Product(2, "bread", 120),
                new Product(3, "orange", 130),
                new Product(4, "potato", 30),
                new Product(5, "apple", 50)
        ));
    }

    public void findById(int id) {
        for (Product p : products)
            if (p.getId() == id){
                System.out.println(p.getId()+" "+p.getTitle()+" "+p.getPrice());
            }else if(id==0)//если введем 0-получим весь список
            {System.out.println(p.getId()+" "+p.getTitle()+" "+p.getPrice());
            }
    }
}
