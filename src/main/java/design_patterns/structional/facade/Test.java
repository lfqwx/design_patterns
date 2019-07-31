package design_patterns.structional.facade;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 11:43
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("农夫山泉");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
