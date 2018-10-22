/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma;

/**
 *
 * @author Estudiantes
 */
import java.util.Scanner;
public class Suma {
Scanner reader = new Scanner(System.in);

public void Suma(){
    int numero1 = 0;
int numero2 = 0;
 
System.out.println("Introduce el primer número:");			
numero1 = reader.nextInt();
 
System.out.println("Introduce el segundo número:");
numero2 = reader.nextInt();
int resultado = numero1+numero2;

System.out.println("La suma es " + numero1 + " + " + numero2 + " = " + resultado);

}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Suma sm = new Suma ();
        sm.Suma();
    }
    
}
