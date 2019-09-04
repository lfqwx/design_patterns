package design_patterns.structional.composite;

/**
 * @author 𝓛.𝓕.𝓠
 */
public class Test {
    public static void main(String[] args) {
        CatalogComponent imooc = new Catalog("慕课学习视频目录",1);
        Cource cource1 = new Cource("10小时大数据入门", 200);
        Cource cource2 = new Cource("操作系统原理", 200);

        Catalog javaCatalog = new Catalog("JAVA课程目录",2);
        Cource cource3 = new Cource("JAVA高并发解决方案", 300);
        Cource cource4 = new Cource("JAVA企业级管理系统", 300);

        javaCatalog.add(cource3);
        javaCatalog.add(cource4);
        imooc.add(cource1);
        imooc.add(cource2);
        imooc.add(javaCatalog);

        imooc.print();


    }
}
