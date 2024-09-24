package week_02.explanation;

public class Policy {
    static final int PRICE_POLICY_LEVEL_1 = 30_000;
    static final int PRICE_POLICY_LEVEL_2 = 100_000;
    static final int DELIVERY_DISCOUNT_AMOUNT = 1000;
    static final int DELIVERY_CHARGE_FREE = 0;

    public static int deliveryChangeWeightPolicy(double weight){
        if(weight < 3){
            return 1000;
        } else if(weight < 10){
            return 5000;
        } else{
            return 10000;
        }
    }
}
