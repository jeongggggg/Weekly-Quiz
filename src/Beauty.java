public class Beauty extends Product{
    Beauty(String name, int price, int weight){
        super(name, price, weight);
    }

    @Override
    public int getDiscountAmount() {
        return 10000;
    }
}
