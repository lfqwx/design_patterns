package design_patterns.structional.facade;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 11:36
 */
public class ShippingService {
    public String shipGift(PointsGift pointsGift){
        //物流系统对接逻辑
        System.out.println(pointsGift.getName()+"进入物流系统！");
        String shippingNo = "666";
        return shippingNo;
    }
}
