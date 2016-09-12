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
    ImageIcon img =new ImageIcon("");
    public Ficha(String i){
        img = new ImageIcon(getClass().getResource(i));
    }
    public Ficha(){
        img=new ImageIcon("");
    }

    public ImageIcon getImg() {
        return img;
    }
    
    
    
    
}
