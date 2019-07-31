package design_patterns.principle.openclose;

import lombok.Getter;
import lombok.Setter;

/**
 * @author L.F.Q
 * @date 2019/6/24 9:49
 */
@Setter
@Getter
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
