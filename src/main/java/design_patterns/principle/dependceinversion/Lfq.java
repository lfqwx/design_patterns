package design_patterns.principle.dependceinversion;

import lombok.Setter;

/**
 * @author L.F.Q
 * @date 2019/6/24 10:43
 */
@Setter
public class Lfq {
    ICourse iCourse;

    public void studyImoocCourse() {
        iCourse.studyImoocCourse();
    }

}
