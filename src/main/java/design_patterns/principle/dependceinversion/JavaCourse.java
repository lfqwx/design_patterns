package design_patterns.principle.dependceinversion;

import lombok.extern.slf4j.Slf4j;

/**
 * @author L.F.Q
 * @date 2019/6/24 10:39
 */
@Slf4j
public class JavaCourse implements ICourse{
    @Override
    public void studyImoocCourse() {
      log.info("\n学习java中。。。");
    }
}
