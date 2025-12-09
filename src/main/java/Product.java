import java.time.Instant;

public class Product {
    private int id;
    private String name;
    private double price;
    private Instant creationDateTime;
    private Category category;

    public Product(int id, String name, double price, Instant creationDateTime, Category category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.creationDateTime = creationDateTime;
        this.category = category;
    }

    public String getCategoryName() {
        return category.getName();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public Instant getCreationDateTime() {
        return creationDateTime;
    }

    public Category getCategory() {
        return category;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCreationDateTime(Instant creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
