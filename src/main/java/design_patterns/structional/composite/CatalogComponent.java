package design_patterns.structional.composite;

/**
 * @author 𝓛.𝓕.𝓠
 * 组合模式：针对树形结构（如目录）、可忽略组合对象与单个对象的差异时
 * 优点：清楚的定义分层次的复杂对象，让客户端忽略层次的差异，方便对整个层次结构进行控制。符合开闭原则，简化客户端代码
 * 缺点：限制类型时，需要做复制操作，设计更加抽象
 */
public abstract class CatalogComponent {
    public void add(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不允许添加");
    }
    public void remove(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不允许删除");
    }
    public String getName(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不允许获取名称");
    }
    public double getPrice(CatalogComponent catalogComponent){
        throw new UnsupportedOperationException("不允许获取价格");
    }
    public void print(){
        throw new UnsupportedOperationException("不允许打印");
    }
}
