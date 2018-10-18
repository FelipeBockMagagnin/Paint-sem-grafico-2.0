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
     *
     * @param form
     */
    public void adicionarForma(Forma form){
        this.area = form.area() + this.area;
        System.out.println("Area total: " + this.area);
    }
}
