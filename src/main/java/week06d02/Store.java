package week06d02;
import java.util.ArrayList;
import java.util.List;

public class Store {

    private List<Product> products = new ArrayList<>();

    public Store(List<Product> paraProduct) {
        this.products = paraProduct;
    }


    public int getProductByCategoryName(String paraCategory) {
        int counter = 0;
        for (Product db : products) {
            if (db.getCategory().equals(paraCategory)) {
                counter++;
            }

        }
        return counter;
    }


}