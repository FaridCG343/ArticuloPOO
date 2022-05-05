/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaTec;

/**
 *
 * @author farid
 */
public class Cargador extends Accesorios{
    private String para, tipo;

    public Cargador(String para, String tipo, double precio, String clave) {
        super(precio, clave);
        this.para = para;
        this.tipo = tipo;
    }

    public String getPara() {
        return para;
    }

    public void setPara(String para) {
        this.para = para;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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
        return super.toString()+"\nCargador" + "para=" + para + ", tipo=" + tipo;
    }
    
}
