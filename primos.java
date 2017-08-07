
/**
 * Write a description of class primos here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class primos
{
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         int a = 0 , i , numero;
         System.out.println("Ingrese el número que desea analizar: ");
         numero = leer.nextInt();
         for(i = 1; i < (numero + 1); i++){
         if(numero % i==0){
             a++;
            }
         }
         if(a != 2){
              System.out.println("El número " + numero + " No es Primo");
         }
         else{
              System.out.println("El número " + numero + " Si es Primo");
         }
     }

}
