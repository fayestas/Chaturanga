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
public class Caballo extends Ficha {
    
    public Caballo(int fila){
        super(new ImageIcon((fila==0?"imagenes/Blackknight.png":"imagenes/WhiteKnight.png")));
    }
    
}
