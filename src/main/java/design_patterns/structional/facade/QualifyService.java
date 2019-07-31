package design_patterns.structional.facade;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 11:30
 */
public class QualifyService {
    public boolean isAvilable(PointsGift pointsGift){
        System.out.println("校验："+pointsGift.getName()+
        "积分资格通过！");
        return true;
    }
}
