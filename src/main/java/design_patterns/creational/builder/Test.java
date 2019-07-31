package design_patterns.creational.builder;

import lombok.extern.slf4j.Slf4j;

/**
 * @author L.F.Q
 * @date 2019/6/25 8:47
 */
@Slf4j
public class Test extends CourseActualBuilder {
    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("java设计模式精讲", "javaPPT", "java视频",
                "java手记", "java问答");
        log.info("\n"+course);

    }
}
