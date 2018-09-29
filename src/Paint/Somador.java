/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paint;

/**
 * 
 * @author Felpi
 */
public class Somador {
    double area = 0;
    
    /**
     * adiciona a area do triangulo ao somador
     * 
     * @param tri triangulo
     */
    public void adicionarTriangulo(Triangulo tri){
       this.area = tri.area() + this.area;        
    }
    
    /**
     * adiciona a area do retangulo ao somador
     * 
     * @param ret retangulo
     */
    public void adicionarRetangulo(Retangulo ret){
        this.area = ret.area() + this.area;
    }
    
    /**
     * 
     * @param cir circulo
     */
    public void adicionarCirculo(Circulo cir){
        this.area = cir.area() + this.area;
    }    
}
