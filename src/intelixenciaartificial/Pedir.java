
package intelixenciaartificial;

import java.util.Scanner;

public class Pedir {
    String nome;
    Scanner sc=new Scanner(System.in);
    public void pedirNome(){
    
        System.out.println("¿Cual es tu nombre?");
        nome=sc.next();
    
}
}