package design_patterns.creational.singleton;

/**
 * @author L.F.Q
 * @date 2019/6/26 10:05
 */

public enum EnumSingleton {
    INSTANCE{
        @Override
        protected void printTest(){
            System.out.println("lfq love wx");
        }
    };
    protected abstract void printTest();
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    public static EnumSingleton getInstacne(){
        return INSTANCE;
    }
}
