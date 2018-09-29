/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paint;
import java.util.Scanner;

public class IntroOOP {

  /**
   * @param args the command line arguments
   */
    public static void main(String[] args) {  
      
        int input;
        double altura,largura,raio,folhaAltura,folhaLargura,x,y;
      
        Scanner scan = new Scanner(System.in);
        Somador som = new Somador ();
    
        System.out.println("Bem vindo ao Super Paint");    
        System.out.println("Tamanho da folha   ");
        System.out.print("Altura:");
        folhaAltura = scan.nextDouble();
        System.out.print("Largura:");
        folhaLargura = scan.nextDouble();
    
        Folha folha = new Folha(folhaAltura, folhaLargura);


        do{
            System.out.println("****************************************************");
            System.out.println("Escolha a forma que deseja criar");
            System.out.println("0 - Parar o programa e listar formas");
            System.out.println("1 - Retangulo");
            System.out.println("2 - Circulo");
            System.out.println("3 - Triangulo");

            input = scan.nextInt();   

            System.out.println("*************************************************************");
            
            switch (input){
                case 0:
                    break;

                case 1: 
                    System.out.println("Aonde deseja adicionar a forma?");
                    System.out.print("x: ");
                    x = scan.nextDouble();
                    System.out.print("y: ");
                    y = scan.nextDouble();
                    System.out.print("Escreva a largura");
                    largura = scan.nextDouble();
                    System.out.print("Escreva a altura");
                    altura = scan.nextDouble();

                    if((largura + x) <= folhaLargura && (altura + y) <= folhaAltura){
                        Retangulo ret = new Retangulo(altura,largura,x,y);
                        folha.adicionarRetangulo(ret);
                        som.adicionarRetangulo(ret);
                    } else {
                        System.out.println("Error");
                        System.out.println("****************************************************");
                        input = 0;
                    }                
                    break;
                case 2:                
                    System.out.println("Aonde deseja adicionar a forma?");
                    System.out.print("x: ");
                    x = scan.nextDouble();
                    System.out.print("y: ");
                    y = scan.nextDouble();

                    System.out.print("Escreva o raio");
                    raio = scan.nextDouble();
                    if((raio + y) <= folhaAltura && (raio + x) <= folhaLargura){
                        Circulo cir = new Circulo (raio,x,y);
                        folha.adicionarCirculo(cir);
                        som.adicionarCirculo(cir);
                    } else {
                        System.out.println("");
                        System.out.println("Error");
                        System.out.println("****************************************************");
                        input = 0;
                    }
                    break;

                case 3:
                    System.out.println("Aonde deseja adicionar a forma?");
                    System.out.print("x: ");
                    x = scan.nextDouble();
                    System.out.print("y: ");
                    y = scan.nextDouble();

                    System.out.print("Escreva a largura");
                    largura = scan.nextDouble();
                    System.out.print("Escreva a altura");
                    altura = scan.nextDouble();

                    if((largura + x) <= folhaLargura && (altura + y) <= folhaAltura){
                        Triangulo tri = new Triangulo(altura,largura,"a",x,y);
                        folha.adicionarTriangulo(tri);
                        som.adicionarTriangulo(tri);
                    } else {
                        System.out.println("Error");
                        System.out.println("****************************************************");
                        input = 0;
                    }
                break;
            }
            
            if(input!= 0){
                System.out.println("****************************************************");
                System.out.println("Forma adicionada com sucesso");   
            }
        } while(input != 0);
        
        
        folha.resumo();
        System.out.println("****************************************************");
        System.out.println("Area total utilizada: " + som.area);
        System.out.println("****************************************************");
        
        System.out.println("Você deseja listar as formas: ");
        System.out.println("1 - Por ordem de cronologica");
        System.out.println("2 - Por ordem de forma");
        input = scan.nextInt();
        
        
        switch(input){
            case 1:
                System.out.println("****************************************************");
                folha.listarOrdenado(); 
                System.out.println("****************************************************");
                break;
            case 2:
                System.out.println("****************************************************");
                folha.listarFormas();  
                System.out.println("****************************************************");
                break;                
        }       
        
        System.out.println("Obrigado por utilizar o Super Paint");
    }
}