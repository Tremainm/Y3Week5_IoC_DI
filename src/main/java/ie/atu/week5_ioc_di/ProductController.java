package ie.atu.week5_ioc_di;

import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/getProduct")
    public List<Product> getProducts()
    {
        List = myService.getProduct();
        return List;
    }
    @PostMapping("/addProduct")
    public List<Product> newProduct(@RequestBody Product product)
    {
        //send it to do business logic
        List = myService.addProduct(product);
        return List;
    }
    @PutMapping("/updateProduct/{id}")
    public List<Product> updateProducts(@RequestBody Product product, @PathVariable int id)
    {
        List = myService.updateProduct(product, id);
        return List;
    }
    @DeleteMapping("/deleteProduct/{id}")
    public List<Product> deleteProducts(@PathVariable int id)
    {
        List = myService.deleteProduct(id);
        return List;
    }
}