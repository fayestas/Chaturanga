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
    
    Ficha [][] tablero = new Ficha[8][8];
    
    public boolean setFichas(){
        setPeones();
        setOtras();
        return true;
    }
    
    public void setPeones(){
        int fila = 1;
        for(int c=0; c<8; c++){
            tablero[fila][c] = new Peon(fila);
            if(c==7 && fila==1){
                c=0;
                fila=6;
            }
        }
    }
    
    public void setOtras(){
        setAddOtras();
        tablero[7][3]= new Consejero();
        tablero[0][4]= new Consejero();
        tablero[0][3]= new Rey();
        tablero[7][4]= new Rey();
                
    }
    
    public void setAddOtras(){
        int f=0;
        
        do{
            tablero[f][0] = new Torre();
            tablero[f][1] = new Caballo();
            tablero[f][2] = new Elefante();
            tablero[f][5] = new Elefante();
            tablero[f][6] = new Caballo();
            tablero[f][7] = new Torre();
            f=7;
        }while(f!=7);
    }
    
}

