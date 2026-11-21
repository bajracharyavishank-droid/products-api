package uk.ac.westminster.products_api;

// A PhysicalProduct IS-A Product because it is still sold with an id, name and price, it just gets shipped
// a Warehouse would not pass this, it stores products but it is not a product itself (HAS-A)
public class PhysicalProduct extends Product {

    private double weightKg;
    private String dimensions;

    public PhysicalProduct() {
    }

    public PhysicalProduct(Long id, String name, double price,
                           double weightKg, String dimensions) {
        super(id, name, price);
        setWeightKg(weightKg);
        setDimensions(dimensions);
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setWeightKg(double weightKg) {
        if (weightKg < 0) {
            throw new IllegalArgumentException("weight cannot be negative");
        }
        this.weightKg = weightKg;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}
