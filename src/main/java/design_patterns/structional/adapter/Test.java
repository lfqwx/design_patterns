package design_patterns.structional.adapter;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 17:12
 */
public class Test {
    public static void main(String[] args) {
        DC5V dc5V = new DC5VImpl();
        dc5V.output();
        DC5V dc5V1 = new PowerAdapter();
        dc5V1.output();
    }
}
