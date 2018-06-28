/**
 * 
 */
package cn.com.chubb.designPattern.builder;

/**
 * @author Devin
 *
 */
public abstract class ColdDrink implements Item {

	@Override
    public Packing packing() {
       return new Bottle();
    }
 
    @Override
    public abstract float price();

}
