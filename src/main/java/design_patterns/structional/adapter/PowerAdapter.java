package design_patterns.structional.adapter;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 17:11
 */
public class PowerAdapter implements DC5V {
    private AC220V ac220V = new AC220V();
    @Override
    public int output() {
        int output = ac220V.output()/44;
        System.out.println("使用PowerAdapter输入AC适配以后的电压为："+output+"V");
        return output;
    }
}
