//dato un intero fare la potenza 

import java.util.Scanner;

public class casa2 
{
    public static void main (String[] args)
    {
    
        int numero, potenza, esponente;
     
        Scanner stampante = new Scanner(System.in);
        
        System.out.print("inserisci un numero");
        numero = stampante.nextInt();
 
        System.out.print("inserisci l'esponente");
        esponente = stampante.nextInt();

        potenza = potenza(numero, esponente);
 
        System.out.print("la potenza e'" + potenza);
    }

    private static int potenza (int numero, int esponente)
    {

        int potenza = numero;
 
        for (int i = 1; i < esponente; i++)
            potenza*= numero;
        
        return potenza;
    }

}
        
