/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiendaTec;

import java.text.DecimalFormat;

/**
 *
 * @author 701
 */
public class AppMainTT {
    public static void main(String[] args) {
        DecimalFormat df=new DecimalFormat("#.00");
        Articulo A001=new iPhone("iPhone 11","1262437284",20300.00,"CIPHONE11R45893ND");
        //public Andorid(String modelo, String marca, String imei, double precio, String clave) {
        Articulo A002=new Andorid("Galaxy A-20","Samsung","8824924829",5500.00,"2ehw9hd3");
        //public Audifonos(String modelo, double precio, String clave) {
        Articulo A003=new Audifonos("Resound Gn.",500,"j33r3rw3");
        //public Cases(String modelo, String marca, String para, double precio, String clave) {
        Articulo A004=new Cases("ModeloX","MarcaX","Iphone 11",400,"238yr89f3y8");
        //public Cargador(String para, String tipo, double precio, String clave)
        Articulo A005=new Cargador("Android ","C",1000,"h2e82d8d");
        System.out.println(A001+"\n"+df.format(A001.ventas()));
        System.out.println(A002+"\n"+df.format(A002.ventas()));
        System.out.println(A003+"\n"+df.format(A003.ventas()));
        System.out.println(A004+"\n"+df.format(A004.ventas()));
        System.out.println(A005+"\n"+df.format(A005.ventas()));
    }
}
