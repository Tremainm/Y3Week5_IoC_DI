package ie.atu.week5_ioc_di;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService myService;

    public ProductController(ProductService myService) {
        this.myService = myService;
    }

    private List<Product> List = new ArrayList<>();
    //creating a class which is interested in requests and responses. Separation of concern
    @PostMapping("/addProduct")
    public List<Product> newProduct(@RequestBody Product product)
    {
        //send it to do business logic
        List = myService.addProduct(product);
        return List;
    }
}