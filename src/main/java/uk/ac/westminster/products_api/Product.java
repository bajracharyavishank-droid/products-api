package uk.ac.westminster.products_api;

public class Product {

    private Long id;
    private String name;
    private double price;

    public Product() {}

    public Product(Long id, String name, double price) {
        setId(id);
        setName(name);
        setPrice(price);
    }

    public Long getId() { return id; }

    public String getName() { return name; }

    public double getPrice() { return price; }

    public void setId(Long id) {
        if (id != null && id < 1) {
            throw new IllegalArgumentException("id must be 1 or more");
        }
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be empty");
        }
        this.name = name;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be negative");
        }
        this.price = price;
    }
}
