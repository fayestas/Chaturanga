/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chaturanga;

/**
 *
 * @author Frances
 */
public class Tablero {
    
   public static Ficha [][] tablero = new Ficha[8][8];
    
    public boolean setFichas(){
        setPeones();
        setOtras();
        setVacias();
        return true;
    }
    
    public void setPeones(){
        int fila = 1;
        for(int c=0; c<8; c++){
            tablero[fila][c] = new Peon(fila);  
        }
        fila=6;
        for(int c=0; c<8; c++){
            tablero[fila][c] = new Peon(fila);

        }
        fila=6;
        for(int c=0; c<8; c++){
            tablero[6][c] = new Peon(6);
        }
        
    }
    
    public void setOtras(){
        setAddOtras();
        tablero[7][3]= new Consejero(7);
        tablero[0][4]= new Consejero(0);
        tablero[0][3]= new Rey(0);
        tablero[7][4]= new Rey(7);
                
    }
    
    public void setAddOtras(){
        int f=0;

            tablero[f][0] = new Torre(f);
            tablero[f][1] = new Caballo(f);
            tablero[f][2] = new Elefante(f);
            tablero[f][5] = new Elefante(f);
            tablero[f][6] = new Caballo(f);
            tablero[f][7] = new Torre(f);
        f=7;
            tablero[f][0] = new Torre(f);
            tablero[f][1] = new Caballo(f);
            tablero[f][2] = new Elefante(f);
            tablero[f][5] = new Elefante(f);
            tablero[f][6] = new Caballo(f);
            tablero[f][7] = new Torre(f);

        
    }
    
    public void setVacias(){
        for(int f=2;f<6;f++){
            for(int c=0; c<8; c++){
                tablero[f][c]=new Ficha();
            }
        }
    
    }
    
}

