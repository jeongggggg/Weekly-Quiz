package week_02.explanation;

import static week_02.explanation.Policy.*;

public class Cart {
    private Product[] products;
    private int totalPrice; // 필드
    private double totalWeight; // 필드

    public Cart(Product[] products){
        this.products = products;
        for(Product product : products){
            // 필드 초기화
            this.totalPrice += product.getPrice();
            this.totalWeight += product.getWeight();
        }
    }

    /* 다른 방법
    public int getTotalPrice(){
        // for
        return totalPrice;
    }

    public double getTotalWeight(){
        // for
        return totalWeight;
    }*/

    public int calculateDeliveryCharge(){
        // 1. 무게에 따라 배송비 책정
        int deliveryCharge = deliveryChangeWeightPolicy(totalWeight);

        // 2. 상품(할인 금액 적용된) 가격에 따라 추가 계산

        if(totalPrice < PRICE_POLICY_LEVEL_1){
            return deliveryCharge;
        } else if(totalPrice < Policy.PRICE_POLICY_LEVEL_2){
            return deliveryCharge - Policy.DELIVERY_DISCOUNT_AMOUNT;
        }
        return DELIVERY_CHARGE_FREE;
    }
}
