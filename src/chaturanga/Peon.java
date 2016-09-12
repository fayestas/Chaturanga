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
public class Peon extends Ficha{
    
    public Peon(int fila){
        super(fila==1?"/imagenes/BlackPawn.png":"/imagenes/WhitePawn.png");
    }
    
}
