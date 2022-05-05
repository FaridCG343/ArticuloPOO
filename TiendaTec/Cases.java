/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaTec;

/**
 *
 * @author farid
 */
public class Cases extends Accesorios{
    private String modelo, marca, para;

    public Cases(String modelo, String marca, String para, double precio, String clave) {
        super(precio, clave);
        this.modelo = modelo;
        this.marca = marca;
        this.para = para;
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

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public double ventas() {
        return precio*1.1;
    }

    @Override
    public String toString() {
        return super.toString()+"\nCases" + "modelo=" + modelo + ", marca=" + marca + ", para=" + para;
    }
    
}
