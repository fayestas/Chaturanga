/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaturanga;

import java.util.ArrayList;

/**
 *
 * @author USER1
 */
public class Usuarios {
    ArrayList<Usuario> players = new ArrayList<>();
    
    public Usuario buscar(String nombre){
        for(Usuario e: players){
            if(e.getNombre().equals(nombre)){
                return e;
            }
        }
        return null;
    }
}