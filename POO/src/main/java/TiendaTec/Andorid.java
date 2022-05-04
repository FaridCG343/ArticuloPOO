/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaTec;

/**
 *
 * @author 701
 */
public class Andorid extends Celular{
    public String modelo;
    public String marca;

    public Andorid(String modelo, String marca, String imei, double precio, String clave) {
        super(imei, precio, clave);
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public double ventas() {
        return precio * 1.15;
    }
    
    @Override
    public String toString() {
        return super.toString()+"\nAndorid" + "modelo: " + modelo + ", marca: " + marca ;
    }
    
}
