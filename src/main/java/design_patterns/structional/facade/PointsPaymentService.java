package design_patterns.structional.facade;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 11:33
 */
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift){
        //扣减积分
        System.out.println("支付"+pointsGift.getName()+"成功");
        return true;
    }
}
