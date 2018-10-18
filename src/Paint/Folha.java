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
public class Folha {
    double altura, largura;
    int numeroForma = 0, numeroTriangulos = 0, numeroRetangulos = 0, numeroCirculos = 0;
    Forma[] formas;
    int z = 0;
    
    /**
     * 
     * @param altura
     * @param largura 
     */
    public Folha(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
        formas = new Forma[10];
    }

    /**
     *
     * @param largura
     * @param altura
     * @param x
     * @param y
     * @return
     */
    public boolean estaDentro(double largura,double altura, double x, double y){
        return(altura + y <= this.altura && largura + x <= this.largura);
    }


    /**
     *
     * @param form
     */
    public void adicionarForma(Forma form){
        formas[numeroForma] = form;
        numeroForma++;
        form.z = this.z;
        z++;
        if(form instanceof Triangulo){
            numeroTriangulos++;
        } else if (form instanceof Circulo){
            numeroCirculos++;
        } else {
            numeroRetangulos++;
        }

    }
    
    /**
     * escreve um resumo das formas que foram postas na folha
     * 
     */
    public void resumo(){
        System.out.println("*************************************************************");        
        System.out.println("Total de formas: " + (numeroForma));
        System.out.println("Total de Triangulos: " + numeroTriangulos);
        System.out.println("Total de Circulos: " + numeroCirculos);
        System.out.println("Total de Retangulos: " + numeroRetangulos);
        System.out.println("Z: " + z);
        System.out.println("Altura da folha: " + this.altura);
        System.out.println("Largura da folha: " + this.largura);
        
        System.out.println("*************************************************************");
    }
    
    /**
     * lista as formas em ordem cronologica 
     */
    public void listarFormas(){       
    
        for(int c = 0; c < numeroCirculos; c++){
            System.out.println("Area do Circulo: " + formas[c].area());
            System.out.println("Perimetro do Circulo: " + formas[c].perimetro());
            System.out.println("Raio do circulo: " + formas[c].raio);
            System.out.println("Z: " + formas[c].z);
            System.out.println("Posição x: " + formas[c].x);
            System.out.println("Posição y: " + formas[c].y);
            System.out.println("*************************************************************");
        }        
        
        for(int c = 0; c < numeroTriangulos; c++){
            System.out.println("Altura do triangulo: " + formas[c].altura);
            System.out.println("Largura do triangulo: " + formas[c].largura);
            System.out.println("Area do triangulo: " + formas[c].area());
            System.out.println("Perimetro do triangulo: " + formas[c].perimetro());
            System.out.println("Cor do triangulo: " + formas[c].cor);
            System.out.println("Z: " + formas[c].z);
            System.out.println("Posição x: " + formas[c].x);
            System.out.println("Posição y: " + formas[c].y);
            System.out.println("*************************************************************");
        }       
    
        for(int c = 0; c < numeroRetangulos; c++){
            System.out.println("Area do retangulo: " + formas[c].area());
            System.out.println("Perimetro do retangulo: " + formas[c].perimetro());
            System.out.println("Altura do retangulo: " + formas[c].altura);
            System.out.println("Largura do retangulo: " + formas[c].largura);
            System.out.println("Z: " + formas[c].z);
            System.out.println("Posição x: " + formas[c].x);
            System.out.println("Posição y: " + formas[c].y);
            System.out.println("*************************************************************");
        }        
    }
    
    /**
     * lista as formas de acordo com seu z
     */
    public void listarOrdenado(){        
        for(int c = 0; c < z; c++){            
            for(int k = 0; k < numeroCirculos; k++){
                if(formas[k].z == c){
                    System.out.println("*************************************************************");
                    System.out.println("O elemento " + (c+1) + " é um circulo");
                    System.out.println("Area do Circulo: " + formas[k].area());
                    System.out.println("Perimetro do Circulo: " + formas[k].perimetro());
                    System.out.println("Raio do circulo: " + formas[k].raio);
                    System.out.println("Z: " + formas[k].z);
                    System.out.println("Posição x: " + formas[k].x);
                    System.out.println("Posição y: " + formas[k].y);
                    System.out.println("*************************************************************");
                }   
            } 
              
            for(int k = 0; k < numeroRetangulos; k++){
                if(formas[k].z == c){
                    System.out.println("*************************************************************");
                    System.out.println("O elemento " + (c+1) + " é um retangulo");
                    System.out.println("Area do retangulo: " + formas[k].area());
                    System.out.println("Perimetro do retangulo: " + formas[k].perimetro());
                    System.out.println("Altura do retangulo: " + formas[k].altura);
                    System.out.println("Largura do retangulo: " + formas[k].largura);
                    System.out.println("Z: " + formas[k].z);
                    System.out.println("Posição x: " + formas[k].x);
                    System.out.println("Posição y: " + formas[k].y);
                    System.out.println("*************************************************************");
                }
            }
            
            for(int k = 0; k < numeroTriangulos; k++){
                if(formas[k].z == c){
                    System.out.println("*************************************************************");
                    System.out.println("O elemento " + (c+1) + " é um triangulo");
                    System.out.println("Altura do triangulo: " + formas[k].altura);
                    System.out.println("Largura do triangulo: " + formas[k].largura);
                    System.out.println("Area do triangulo: " + formas[k].area());
                    System.out.println("Perimetro do triangulo: " + formas[k].perimetro());
                    System.out.println("Cor do triangulo: " + formas[k].cor);
                    System.out.println("Z: " + formas[k].z);
                    System.out.println("Posição x: " + formas[k].x);
                    System.out.println("Posição y: " + formas[k].y);
                    System.out.println("*************************************************************");
                }                
            } 
        }
    }  
}
