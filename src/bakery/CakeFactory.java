/*
 * 
 * 
 * 
 */
package bakery;

/**
 *
 * @author HsCanales <00136317@uca.edu.sv>
 */
public class CakeFactory {
    public static Cake getCake(CakeType criteria){
        switch(criteria){
            case VANILLA:
                return new Vanilla();
            case CHOCOLATE:
                return new Chocolate();
            case ALMONDS:
                return new Almonds();
        }
        return null;
    }
}
