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
public class Triangulo { 
    
  double altura;
  double largura;
  String cor;  
  int z = 0;  
  double x=0,y=0;
  
  
  /**
   *  
   * @return a area do triangulo 
   */
  public double area() {
    return altura*largura/2.0;
  }
  
  /**
   * 
   * @return o perimetro do triangulo 
   */
  public double perimetro(){
      return altura + largura + Math.sqrt(Math.pow(altura, 2) + Math.pow(largura,2));
  }
  
  /**
   * pinta o triangulo de alguma cor
   * 
   * @param novaCor 
   */
  public void pintar(String novaCor) {
    cor = novaCor;
    System.out.println("pintando o triangulo de " + cor);
  }
  
  /**
   * 
   * @param altura
   * @param largura
   * @param cor
   * @param x
   * @param y 
   */
  public Triangulo(double altura, double largura, String cor, double x, double y) {
    this.altura = altura;
    this.largura = largura;
    this.cor = cor;
    this.x = x;
    this.y = y;
  }
  
  
}
