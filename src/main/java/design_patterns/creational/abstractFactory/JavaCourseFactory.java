package design_patterns.creational.abstractFactory;

/**
 * @author L.F.Q
 * @date 2019/6/25 9:14
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
