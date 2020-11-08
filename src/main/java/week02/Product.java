package week02;

public class Product {
    String name;
    String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Product(String name, String code) {
        this.name = name;
        this.code = code;
    }

   
        
    public static void main(String[] args) {
            Product product1 = new Product("Sör", "123");
            Product product2 = new Product("Sör", "123");
            Product product3 = new Product("Sör", "1234");
       
        boolean areTheyEqual;
             equals(product1.name, product2.name, product3.name);

    }

    private static void equals(String name, String name1, String name2) {
    }
}
