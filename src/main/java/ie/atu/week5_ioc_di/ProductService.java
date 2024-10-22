package ie.atu.week5_ioc_di;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product)
    {
        //Do business stuff like retrieving details from database, or generating file pdfs
        myList.add(product);
        return myList;
    }
}
