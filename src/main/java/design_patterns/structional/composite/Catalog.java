package design_patterns.structional.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 𝓛.𝓕.𝓠
 */
public class Catalog extends CatalogComponent {
    private String name;
    private List<CatalogComponent> items = new ArrayList<>();
    //新增level，区别目录级别
    private Integer level;

    public Catalog(String name, Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        this.items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        this.items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);
        for (CatalogComponent component : items) {
            //根据目录级别，决定空格数
            for(int i = 0 ; i < level; i++){
                System.out.print("  ");
            }
            component.print();
        }
    }
}
