package design_patterns.creational.prototype.clone;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * @author L.F.Q
 * @date 2019/6/28 8:25
 */
@Setter
@Getter
public class Pig implements Cloneable{
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();
        pig.birthday = (Date) pig.getBirthday().clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}'+super.toString();
    }
}
