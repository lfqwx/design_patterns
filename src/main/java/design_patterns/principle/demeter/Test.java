package design_patterns.principle.demeter;

/**
 * @author L.F.Q
 * @date 2019/6/24 13:52
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.check(teamLeader);
    }
}
