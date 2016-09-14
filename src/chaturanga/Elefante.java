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
public class Elefante extends Ficha {
    
    public Elefante(int fila){
<<<<<<< HEAD
        super(fila==0?"/imagenes/BlackElephant.png":"/imagenes/WhiteElephant.png");
=======
        super(new ImageIcon((fila==0?"imagenes/BlackElephant.png":"imagenes/WhiteElephnat.png")),fila==0?"imagenes/BlackElephant.png":"imagenes/WhiteElephnat.png");
>>>>>>> origin/master
    }
}
