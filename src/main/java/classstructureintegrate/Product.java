package classstructureintegrate;

public class Product {

    private String name;
    private int price;


    public Product(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int increasePrice(int change) {

        return price + change;
    }

    public int decreasePrice(int change) {

        return price - change;
    }
}



