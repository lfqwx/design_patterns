package design_patterns.structional.composite;

/**
 * @author 𝓛.𝓕.𝓠
 */
public class Cource extends CatalogComponent {

    private String name;
    private double price;

    public Cource(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程名称："+this.name+",价格："+this.price);
    }
}
