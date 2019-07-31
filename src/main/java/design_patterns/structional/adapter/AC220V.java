package design_patterns.structional.adapter;

/**
 * @author 𝓛.𝓕.𝓠
 * @date 2019/6/30 17:07
 */
public class AC220V {
   public int output(){
       int output = 220;
       System.out.println("被适配者输出"+output+"V");
       return output;
   }
}
