package design_patterns.creational.builder.v2;

import lombok.extern.slf4j.Slf4j;

/**
 * @author L.F.Q
 * @date 2019/6/25 10:16
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java设计模式")
                .buildCourseArticle("java设计模式手记")
                .buildCoursePPT("java设计模式PPT")
                .buildCourseVideo("java设计模式video")
                .buildCourseQA("java设计模式QA")
                .build();
        log.info("\n"+course);
    }
}
