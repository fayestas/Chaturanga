/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaturanga;

import javax.swing.ImageIcon;

/**
 *
 * @author Frances
 */
public class Consejero extends Ficha {
    
    public Consejero(int fila){

        super(fila==0?"/imagenes/BlackConsejero.png":"/imagenes/WhiteConsejero.png");

    }
}
