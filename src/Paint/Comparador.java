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
public class Comparador {  
    
  /** 
   * 
   * @param ret
   * @param tri
   * @return se ret maior retorna true
   */  
  public boolean maiorAreaRetTri(Retangulo ret, Triangulo tri) {
      return ret.area() > tri.area();
  }
  
  /**
   * 
   * @param tri
   * @param cir
   * @return se tri maior retorna true
   */
  public boolean maiorAreaTriCir (Triangulo tri, Circulo cir){
      return tri.area() > cir.area();
  } 
  
  /**
   * 
   * @param ret
   * @param cir
   * @return se ret maior retorna true 
   */
  public boolean maiorAreaRetCir (Retangulo ret, Circulo cir){
      return ret.area() > cir.area();
  } 
  
  /**
   * 
   * @param ret
   * @param cir
   * @return se ret maior retorna true 
   */
  public boolean maiorPerimetroRetCir (Retangulo ret, Circulo cir){
      return ret.perimetro() > cir.perimetro();
  } 
  
  /**
   * 
   * @param tri
   * @param cir
   * @return se tri maior retorna true
   */
  public boolean maiorPerimetroTriCir (Triangulo tri, Circulo cir){
      return tri.perimetro() > cir.perimetro();
  } 
  
  /**
   * 
   * @param ret
   * @param tri
   * @return se ret maior retorna true
   */
  public boolean maiorPerimetroRetTri (Retangulo ret, Triangulo tri){
      return ret.perimetro() > tri.perimetro();
  } 
}

