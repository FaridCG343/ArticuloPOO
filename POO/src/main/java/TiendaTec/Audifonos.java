/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaTec;

/**
 *
 * @author 701
 */
public class Audifonos extends Accesorios{
    private String modelo;

    public Audifonos(String modelo, double precio, String clave) {
        super(precio, clave);
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public double ventas() {
        return precio*1.1;
    }
    
    
    
    @Override
    public String toString() {
        return super.toString()+"\nAudifonos{" + "modelo=" + modelo ;
    }
    
}
