package design_patterns.principle.openclose;

import lombok.Getter;
import lombok.Setter;

/**
 * @author L.F.Q
 * @date 2019/6/24 10:11
 */
@Setter
@Getter
public class JavaCourseDiscount extends JavaCourse {
    public JavaCourseDiscount(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice() {
        return super.getPrice()*0.8;
    }
}
