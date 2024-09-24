package week_02.explanation;

public class Product implements Promotion{
    private String name;
    private int price;
    private double weight;

    public Product(String name, int price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    // 접근 제한으로 막혀있기 때문에 getter 메소드
    public int getPrice(){
        return price - getDiscountAmount();
    }
    public double getWeight() {
        return weight;
    }

    @Override
    public int getDiscountAmount(){
        return 0;
    }
}
