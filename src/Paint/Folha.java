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
    int numeroTriangulos = 0, numeroCirculos = 0, numeroRetangulos = 0;
    
    Triangulo[] listaTriangulo;
    Retangulo[] listaRetangulo;
    Circulo[] listaCirculo;
    
    int z = 0;
    
    /**
     * 
     * @param altura
     * @param largura 
     */
    public Folha(double altura, double largura){
        this.altura = altura;
        this.largura = largura;
        
        listaTriangulo = new Triangulo[10];
        listaRetangulo = new Retangulo[10];
        listaCirculo = new Circulo[10];
    }
    
    /**
     * adiciona um triangulo na folha
     * 
     * @param tri 
     */
    public void adicionarTriangulo(Triangulo tri){
        listaTriangulo[numeroTriangulos] = tri;
        numeroTriangulos++;
        tri.z = this.z;
        z++;
    }
    
    /**
     * adiciona um retangulo na folha
     * 
     * @param ret 
     */
    public void adicionarRetangulo(Retangulo ret){
        listaRetangulo[numeroRetangulos] = ret;
        numeroRetangulos++; 
        ret.z = this.z;
        z++;
    }
    
    /**
     * adiciona um circulo na folha
     * 
     * @param cir 
     */
    public void adicionarCirculo (Circulo cir){
        listaCirculo[numeroCirculos] = cir;
        numeroCirculos++;
        cir.z = this.z;
        z++;
    }
    
    /**
     * escreve um resumo das formas que foram postas na folha
     * 
     */
    public void resumo(){
        System.out.println("*************************************************************");        
        System.out.println("Total de formas: " + (numeroTriangulos + numeroRetangulos + numeroCirculos));       
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
            System.out.println("Area do Circulo: " + listaCirculo[c].area());
            System.out.println("Perimetro do Circulo: " + listaCirculo[c].perimetro());
            System.out.println("Raio do circulo: " + listaCirculo[c].raio);
            System.out.println("Z: " + listaCirculo[c].z);
            System.out.println("Posição x: " + listaCirculo[c].x);
            System.out.println("Posição y: " + listaCirculo[c].y);
            System.out.println("*************************************************************");
        }        
        
        for(int c = 0; c < numeroTriangulos; c++){
            System.out.println("Altura do triangulo: " + listaTriangulo[c].altura);
            System.out.println("Largura do triangulo: " + listaTriangulo[c].largura);
            System.out.println("Area do triangulo: " + listaTriangulo[c].area());
            System.out.println("Perimetro do triangulo: " + listaTriangulo[c].perimetro());
            System.out.println("Cor do triangulo: " + listaTriangulo[c].cor);
            System.out.println("Z: " + listaTriangulo[c].z);
            System.out.println("Posição x: " + listaTriangulo[c].x);
            System.out.println("Posição y: " + listaTriangulo[c].y);
            System.out.println("*************************************************************");
        }       
    
        for(int c = 0; c < numeroRetangulos; c++){
            System.out.println("Area do retangulo: " + listaRetangulo[c].area());
            System.out.println("Perimetro do retangulo: " + listaRetangulo[c].perimetro());
            System.out.println("Altura do retangulo: " + listaRetangulo[c].altura);
            System.out.println("Largura do retangulo: " + listaRetangulo[c].largura);   
            System.out.println("Z: " + listaRetangulo[c].z);
            System.out.println("Posição x: " + listaRetangulo[c].x);
            System.out.println("Posição y: " + listaRetangulo[c].y);
            System.out.println("*************************************************************");
        }        
    }
    
    /**
     * lista as formas de acordo com seu z
     */
    public void listarOrdenado(){        
        for(int c = 0; c < z; c++){            
            for(int k = 0; k < numeroCirculos; k++){
                if(listaCirculo[k].z == c){
                    System.out.println("*************************************************************");
                    System.out.println("O elemento " + (c+1) + " é um circulo");
                    System.out.println("Area do Circulo: " + listaCirculo[k].area());
                    System.out.println("Perimetro do Circulo: " + listaCirculo[k].perimetro());
                    System.out.println("Raio do circulo: " + listaCirculo[k].raio);
                    System.out.println("Z: " + listaCirculo[k].z);
                    System.out.println("Posição x: " + listaCirculo[k].x);
                    System.out.println("Posição y: " + listaCirculo[k].y);
                    System.out.println("*************************************************************");
                }   
            } 
              
            for(int k = 0; k < numeroRetangulos; k++){
                if(listaRetangulo[k].z == c){
                    System.out.println("*************************************************************");
                    System.out.println("O elemento " + (c+1) + " é um retangulo");
                    System.out.println("Area do retangulo: " + listaRetangulo[k].area());
                    System.out.println("Perimetro do retangulo: " + listaRetangulo[k].perimetro());
                    System.out.println("Altura do retangulo: " + listaRetangulo[k].altura);
                    System.out.println("Largura do retangulo: " + listaRetangulo[k].largura);   
                    System.out.println("Z: " + listaRetangulo[k].z);
                    System.out.println("Posição x: " + listaRetangulo[k].x);
                    System.out.println("Posição y: " + listaRetangulo[k].y);
                    System.out.println("*************************************************************");
                }
            }
            
            for(int k = 0; k < numeroTriangulos; k++){
                if(listaTriangulo[k].z == c){
                    System.out.println("*************************************************************");
                    System.out.println("O elemento " + (c+1) + " é um triangulo");
                    System.out.println("Altura do triangulo: " + listaTriangulo[k].altura);
                    System.out.println("Largura do triangulo: " + listaTriangulo[k].largura);
                    System.out.println("Area do triangulo: " + listaTriangulo[k].area());
                    System.out.println("Perimetro do triangulo: " + listaTriangulo[k].perimetro());
                    System.out.println("Cor do triangulo: " + listaTriangulo[k].cor);
                    System.out.println("Z: " + listaTriangulo[k].z);
                    System.out.println("Posição x: " + listaTriangulo[k].x);
                    System.out.println("Posição y: " + listaTriangulo[k].y);
                    System.out.println("*************************************************************");
                }                
            } 
        }
    }  
}
