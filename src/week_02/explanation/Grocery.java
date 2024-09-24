package week_02.explanation;

public class Grocery extends Product{
    public Grocery(String name, int price, double weight){
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount(){
        return 2000;
    }
}
