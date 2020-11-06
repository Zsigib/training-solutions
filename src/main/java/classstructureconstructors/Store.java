package classstructureconstructors;

public class Store {
    private String Product;
    private int stock;

    public Store(String product) {
        this.Product = product;
        stock = 0;
    }

    public String getProduct() {
        return Product;
    }

    public void setProduct(String product) {
        Product = product;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void store(int amount){
        stock = stock + amount;
    }

    public void dispatch (int amount) {
        stock = stock - amount;
    }

}
