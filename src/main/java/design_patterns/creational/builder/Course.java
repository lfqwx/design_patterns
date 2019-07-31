package design_patterns.creational.builder;

import lombok.Getter;
import lombok.Setter;

/**
 * @author L.F.Q
 * @date 2019/6/25 6:03
 */
@Setter
@Getter
public class Course {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;

    @Override
    public String toString() {
        return "Course{" +
                "\ncourseName='" + courseName + '\'' +
                ", \ncoursePPT='" + coursePPT + '\'' +
                ", \ncourseVideo='" + courseVideo + '\'' +
                ", \ncourseArticle='" + courseArticle + '\'' +
                ", \ncourseQA='" + courseQA + '\'' +"\n"+
                '}';
    }
}
