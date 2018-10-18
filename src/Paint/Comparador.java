/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paint;

import java.text.Normalizer;

/**
 *
 * @author Felpi
 */
public class Comparador {

    /**
     *
     * @param form1
     * @param form2
     * @return
     */
    public boolean comparaArea(Forma form1, Forma form2) {
        return form1.area() > form2.area();
    }

    /**
     *
     * @param form1
     * @param form2
     * @return
     */
    public boolean comparaPerimetro(Forma form1, Forma form2) {
        return form1.perimetro() > form2.perimetro();
    }
}


