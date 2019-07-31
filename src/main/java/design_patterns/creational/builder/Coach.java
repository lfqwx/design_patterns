package design_patterns.creational.builder;

import lombok.Setter;

/**
 * @author L.F.Q
 * @date 2019/6/25 8:41
 *
 */
@Setter
public class Coach {
    private CourseBuilder courseBuilder;
    public Course makeCourse(String courseName,String coursePPT,String courseVideo,
                             String courseArticle,String courseQA){
        courseBuilder.buildCourseName(courseName);
        courseBuilder.buildCoursePPT(coursePPT);
        courseBuilder.buildCourseVideo(courseVideo);
        courseBuilder.buildCourseArticle(courseArticle);
        courseBuilder.buildCourseQA(courseQA);
        return courseBuilder.makeCourse();
    }
}
