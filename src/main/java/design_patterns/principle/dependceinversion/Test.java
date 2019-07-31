package design_patterns.principle.dependceinversion;

/**
 * @author L.F.Q
 * @date 2019/6/24 10:42
 */
public class Test {
    /*verson 2:接口注入*/
//    public static void main(String[] args) {
//        Lfq lfq = new Lfq();
//        lfq.studyImoocCourse(new JavaCourse());
//        lfq.studyImoocCourse(new FECourse());
//        lfq.studyImoocCourse(new PythonCourse());
//    }
    /*version 3：构造器注入*/
    /*不方便，想学python需要再new一个对象*/
//    public static void main(String[] args) {
//        Lfq lfq = new Lfq(new JavaCourse());
//        lfq.studyImoocCourse();
//    }
    /*version 4:setter注入*/
    public static void main(String[] args) {
        Lfq lfq = new Lfq();
        lfq.setICourse(new JavaCourse());
        lfq.studyImoocCourse();

        lfq.setICourse(new PythonCourse());
        lfq.studyImoocCourse();
    }
}
