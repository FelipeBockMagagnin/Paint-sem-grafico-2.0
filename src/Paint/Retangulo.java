
package Paint;

/**
 *
 * @author Felpi
 */
public class Retangulo {
  /* As classes podem conter basicamente:
   * Dados: chamados em POO de atributos, membros, campos, propriedades.
   * Procedimentos/Funções: chamados em POO de métodos.
   */
  
  // atributos
  double altura;
  double largura;
  
  int z = 0;
  
  double x=0,y=0;  
  
  /**
   * 
   * @return area do retangulo
   */
  public double area() {
    return altura*largura;
  }
  
  /**
   * 
   * @return area do perimetro 
   */
  public double perimetro(){
      return (altura*2) + (largura * 2);
  }
  
  /**
   * 
   * @param altura
   * @param largura
   * @param x
   * @param y 
   */
  public Retangulo(double altura, double largura, double x, double y) {
    this.largura = largura;
    this.altura = altura;
    this.x = x;
    this.y = y;
  }
  
}
