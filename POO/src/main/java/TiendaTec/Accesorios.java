/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaTec;

/**
 *
 * @author 701
 */
public abstract class Accesorios extends Articulo{

    public Accesorios(double precio, String clave) {
        super(precio, clave);
    }

    @Override
    public String toString() {
        return super.toString()+"\nAccesorios" ;
    }
    
    
}
