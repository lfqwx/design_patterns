package design_patterns.principle.demeter;

/**
 * @author L.F.Q
 * @date 2019/6/24 13:52
 */
public class Boss {
    public void check(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourse();
    }
}
