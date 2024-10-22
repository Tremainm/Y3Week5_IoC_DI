package ie.atu.week5_ioc_di;

import jakarta.validation.Valid;
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

    private List<Product> list = new ArrayList<>();
    //creating a class which is interested in requests and responses. Separation of concern
    @GetMapping("/getProduct")
    public List<Product> getProducts()
    {
        list = myService.getProduct();
        return list;
    }
    @PostMapping("/addProduct")
    public List<Product> newProduct(@Valid @RequestBody Product product)
    {
        //send it to do business logic
        list = myService.addProduct(product);
        return list;
    }
    @PutMapping("/updateProduct/{id}")
    public List<Product> updateProducts(@Valid @RequestBody Product product, @PathVariable int id)
    {
        list = myService.updateProduct(product, id);
        return list;
    }
    @DeleteMapping("/deleteProduct/{id}")
    public List<Product> deleteProducts(@PathVariable int id)
    {
        list = myService.deleteProduct(id);
        return list;
    }
}