package design_patterns.principle.openclose;

import lombok.extern.slf4j.Slf4j;

/**
 * @author L.F.Q
 * @date 2019/6/24 9:56
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        ICourse javaCourse = new JavaCourse(1,"未完待续",100d);
        log.info("\n课程ID："+javaCourse.getId()+"\n课程名称："+javaCourse.getName()+"\n课程价格："+javaCourse.getPrice());
        ICourse icourse1 = new JavaCourseDiscount(2, "未来千年备忘录", 100d);
        JavaCourseDiscount icourse = (JavaCourseDiscount) icourse1;
        log.info("\n课程ID："+icourse.getId()+"\n课程名称："+icourse.getName()+"\n课程价格："+icourse.getDiscountPrice());

    }
}
