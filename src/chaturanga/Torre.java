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
public class Torre extends Ficha {
    
    public Torre(int fila){
        super(new ImageIcon((fila==0?"imagenes/BlackRook.png":"imagenes/WhiteRook.png")),fila==0?"imagenes/BlackRook.png":"imagenes/WhiteRook.png");
    }
    
}
