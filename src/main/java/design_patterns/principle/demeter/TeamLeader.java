package design_patterns.principle.demeter;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @author L.F.Q
 * @date 2019/6/24 13:52
 */
@Slf4j
public class TeamLeader {
    List<Course> list = new ArrayList<>();

    public void checkNumberOfCourse() {
        for (int i = 0; i < 10; i++) {
            list.add(new Course());
        }
        log.info("\n课程数量为:" + list.size());
    }
}
