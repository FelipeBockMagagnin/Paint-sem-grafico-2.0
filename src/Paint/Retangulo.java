package Paint;

/**
 *
 * @author Felpi
 */
public class Retangulo extends Forma {
  
  /**
   * 
   * @return area do retangulo
   */
  @Override
  public double area() {
    return altura*largura;
  }
  
  /**
   * 
   * @return area do perimetro 
   */
  @Override
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
    this.z = 0;
  }
  
}
