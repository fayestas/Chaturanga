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

        super(fila==0?"/imagenes/BlackKnight.png":"/imagenes/WhiteKnight.png");

    }
    
}
