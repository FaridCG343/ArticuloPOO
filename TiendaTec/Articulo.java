/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaTec;

/**
 *
 * @author 701
 */
public abstract class Articulo {
    protected double precio;
    protected String clave;

    public Articulo(double precio, String clave) {
        this.precio = precio;
        this.clave = clave;
    }

    public abstract double ventas();

    @Override
    public String toString() {
        return "Articulo: " + "precio: " + precio + ", clave: " + clave;
    }
    
    
}
