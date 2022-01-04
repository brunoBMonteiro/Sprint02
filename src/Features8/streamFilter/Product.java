package Features8.streamFilter;

public class Product {

    int id;
    String name;
    float price;

    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}' + '\n';

    }
}
