package week_02;

public class LargeAppliance extends Product{
    LargeAppliance(String name, int price, int weight){
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 10000;
    }
}
