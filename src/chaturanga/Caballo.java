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
    ImageIcon negro=new ImageIcon(getClass().getResource("/imagenes/Blackknight.png"));
    ImageIcon blanco=new ImageIcon(getClass().getResource("/imagenes/WhiteKnight.png"));
    public Caballo(int fila){
        super(new ImageIcon((fila==0?"/imagenes/Blackknight.png":"/imagenes/WhiteKnight.png")),fila==0?"imagenes/Blackknight.png":"imagenes/WhiteKnight.png");
         // super(fila==0?new ImageIcon(getClass().getResource("/imagenes/Blackknight.png")):new ImageIcon(getClass().getResource("/imagenes/Blackknight.png"),fila==0?"imagenes/Blackknight.png":"imagenes/WhiteKnight.png");
    }
    
}
