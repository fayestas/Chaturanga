/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaturanga;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Frances
 */
public class Ficha {
    
    String color;
    ArrayList<String> capturas = new ArrayList<>();
    ImageIcon img=null;
    String nombre="";
    public Ficha(ImageIcon i,String n){
        img = new ImageIcon(i.getImage());
        nombre=n;
    }
    public Ficha(){
        img=null;
        nombre="vacio";
    }

    public ImageIcon getImg() {
        return img;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    
    
}
