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
public class Almonds implements Cake{
int porciones = PORCIONES;

    @Override
    public void eat() {
        this.porciones=porciones-1;
        System.out.println("Solo te quedan "+ porciones + " porciones para comer de tu pastel de Almendras");
    }
    
}
