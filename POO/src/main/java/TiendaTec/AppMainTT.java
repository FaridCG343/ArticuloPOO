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
        Articulo A001=new iPhone("iPhone 11","1262437284",20300.00,"CIPHONE11R45893ND");
        DecimalFormat df=new DecimalFormat("#.00");
        System.out.println(A001+"\n"+df.format(A001.ventas()));
        
    }
}
