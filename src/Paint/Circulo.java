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
public class Circulo extends Forma{
    
    /**
     * 
     * @param raio
     * @param x
     * @param y 
     */
    public Circulo(double raio, double x, double y){
        this.raio = raio;
        this.x = x;
        this.y = y;
    }


    /**
     *
     * @return
     */
    @Override
    public double area(){
        return raio * raio * 3.14159265359;
    }

    /**
     * 
     * @return perimetro do circulo
     */
    @Override
    public double perimetro(){
        return 2 * raio * 3.14159265359;
    }
}
