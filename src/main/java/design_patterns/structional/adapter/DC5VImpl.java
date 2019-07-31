package design_patterns.structional.adapter;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 17:10
 */
public class DC5VImpl implements DC5V{
    @Override
    public int output() {
        System.out.println("目标类输出5V");
        return 5;
    }
}
