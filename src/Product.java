public class Product implements Promotion {
    String name;
    int price;
    int weight;
    int discount;

    public Product(String name, int price, int weight, int discount) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.discount = discount;
    }

    @Override
    public int getDiscountAmount() {
        return discount;
    }

    public int getPriceAfterDiscount() {
        return price - discount;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
