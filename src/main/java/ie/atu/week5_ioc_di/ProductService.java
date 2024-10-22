package ie.atu.week5_ioc_di;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product)
    {
        //Do business stuff like retrieving details from database, or generating file pdfs
        myList.add(product);
        return myList;
    }
    
    public List<Product> updateProduct(Product product, int id)
    {
        for(Product p : myList)
        {
            if(Objects.equals(p.getId(), id))
            {
                myList.remove(p);
            }
        }
        myList.add(product);
        return myList;
    }

    public List<Product> deleteProduct(int id)
    {
        for(Product p : myList)
        {
            if(Objects.equals(p.getId(), id))
            {
                myList.remove(p);
            }
        }
        return myList;
    }

    public List<Product> getProduct()
    {
        return myList;
    }
}
