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
public class Bakery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Creamos pastel de Vainilla
         */
        Cake cake = CakeFactory.getCake(CakeType.VANILLA);
        cake.eat();
        /**
         * Creamos pastel de chocolate
         */
        cake=CakeFactory.getCake(CakeType.CHOCOLATE);
        cake.eat();
        
        /**
         * Creamos pastel de Almendras
         */
        cake=CakeFactory.getCake(CakeType.ALMONDS);
        cake.eat();
    }
    
}
