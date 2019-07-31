package design_patterns.principle.singleresponsibility;

/**
 * @author L.F.Q
 * @date 2019/6/24 12:15
 */
public class Test {
    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        WalkBird walkBird = new WalkBird();

        flyBird.mainMove("大雁");
        walkBird.mainMove("鸵鸟");
    }
}
