public class Test {
    public static void main(String[] args) {
        // 다양한 상품 인스턴스 생성
        Product beauty1 = new Beauty("beauty1", 25000, 2);
        Product grocery1 = new Grocery("grocery1", 15000, 4);
        Product largeAppliance1 = new LargeAppliance("largeAppliance1", 60000, 6);
        Product beauty2 = new Beauty("beauty2", 35000, 1);
        Product grocery2 = new Grocery("grocery2", 10000, 2);

        // 테스트 케이스 1: 3개의 상품
        Cart cart1 = new Cart(new Product[] {beauty1, grocery1, largeAppliance1});
        System.out.println("Test Case 1 - Delivery Charge: " + cart1.calculateDeliveryCharge());

        // 테스트 케이스 2: 4개의 상품
        Cart cart2 = new Cart(new Product[] {beauty1, grocery1, largeAppliance1, beauty2});
        System.out.println("Test Case 2 - Delivery Charge: " + cart2.calculateDeliveryCharge());

        // 테스트 케이스 3: 가격이 100,000 이상
        Cart cart3 = new Cart(new Product[] {largeAppliance1, new LargeAppliance("largeAppliance2", 70000, 4)});
        System.out.println("Test Case 3 - Delivery Charge: " + cart3.calculateDeliveryCharge());

        // 테스트 케이스 4: 가격이 30,000 이상, 100,000 미만
        Cart cart4 = new Cart(new Product[] {beauty1, beauty2});
        System.out.println("Test Case 4 - Delivery Charge: " + cart4.calculateDeliveryCharge());

        // 테스트 케이스 5: 무게가 10 이상
        Cart cart5 = new Cart(new Product[] {grocery1, grocery2, new LargeAppliance("largeAppliance3", 80000, 6)});
        System.out.println("Test Case 5 - Delivery Charge: " + cart5.calculateDeliveryCharge());

        // 테스트 케이스 6: 가격과 무게 모두 적은 경우
        Cart cart6 = new Cart(new Product[] {grocery2});
        System.out.println("Test Case 6 - Delivery Charge: " + cart6.calculateDeliveryCharge());
    }
}
