package design_patterns.structional.facade;

import lombok.Data;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 11:39
 */
@Data
public class GiftExchangeService {
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private QualifyService qualifyService = new QualifyService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift){
        if (qualifyService.isAvilable(pointsGift)){
            //资格校验通过
            if (pointsPaymentService.pay(pointsGift)){
                String no = shippingService.shipGift(pointsGift);
                System.out.println("编号为；"+no+"商品已经发送了！");

            }

        }
    }
}
