package design_patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

/**
 * @author L.F.Q
 * @date 2019/6/27 20:48
 */
@Setter
@Getter
@Slf4j
public class Mail implements Cloneable{
    private String name;
    private String emailAddress ;
    private String content;
    public Mail(){
        log.info("Mail class Contructor");
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", address='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        log.info("clone execute");
        return super.clone();
    }
}
