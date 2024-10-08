package week_02;

public class Cart {
    Product[] products;

    public Cart(Product[] products){
        this.products = products;
    }

    public int calculateDeliveryCharge(){
        int totalWeight = 0;
        int totalPrice = 0;

        for (Product product : products) {
            totalWeight += product.getWeight();
            totalPrice += (product.getPrice() - product.getDiscountAmount());
        }

        int deliveryCharge;
        if (totalWeight < 3) {
            deliveryCharge = 1000;
        } else if (totalWeight < 10) {
            deliveryCharge = 5000;
        } else {
            deliveryCharge = 10000;
        }

        if (totalPrice >= 100000) {
            deliveryCharge = 0;
        } else if (totalPrice >= 30000) {
            deliveryCharge = Math.max(deliveryCharge - 1000, 0);
        }

        return deliveryCharge;
    }
}
