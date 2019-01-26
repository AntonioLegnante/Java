//Programmo in Java 

//Primo programma

import java.util.Scanner; //vado in negozio per aquistare 

public class casa //oggetti che dispongo in casa
{
    public static void main (String[] args) //lavori da fare a casa
    {
        int numero1, numero2, differenza, max, min;
        
        
        Scanner stampante = new Scanner(System.in);//collego la stampante ed effettuo la configurazione iniziale
        
        System.out.println("stampa 2 valori"); //uso della stampante per stampare dei dati
        numero1 = stampante.nextInt(); //uso della stampante per generare dei dati
        numero2 = stampante.nextInt();
        
        if (numero1 > numero2) 
        {
            max = numero1;
            min = numero2;
        }
        else 
        {
            max = numero2;
            min = numero1;
        }

        differenza = cameretta (max, min);//mi sposto con i miei oggetti nella mia cameretta
    
        System.out.println("stampa del lavoro svolto" + differenza);

    }

    private static int cameretta (int a, int b) //operazioni svolte in cameretta
    {
        int differenza = 0;
        differenza = a - b;
        return (differenza);
    }

}