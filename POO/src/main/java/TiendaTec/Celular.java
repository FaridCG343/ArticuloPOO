/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaTec;

/**
 *
 * @author 701
 */
public abstract class Celular extends Articulo{
    protected String imei;

    public Celular(String imei, double precio, String clave) {
        super(precio, clave);
        this.imei = imei;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCelular: " + "imei: " + imei ;
    }
    
}
