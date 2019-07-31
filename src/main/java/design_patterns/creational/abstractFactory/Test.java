package design_patterns.creational.abstractFactory;

/**
 * @author L.F.Q
 * @date 2019/6/25 9:26
 */
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
