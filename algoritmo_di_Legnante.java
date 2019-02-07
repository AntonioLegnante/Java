/* algoritmo di legnante */

import java.util.*;

public class algoritmo_di_Legnante
{
    public static void main (String[] args)
    {
        String testo;
        int i = 0, contatore = 0, j = 0;
        System.out.println("inserisci una stringa");
        Scanner stampante = new Scanner(System.in);
        String contenitore;
        testo = stampante.nextLine();
        char [] vocali = {'a', 'e', 'i', 'o', 'u'};
        while (j < 5)
        {
            i = testo.indexOf(vocali[j], i + 1);
            if (i != -1)
                contatore++;
            else 
                j++;
        }
 
       System.out.println("il numero di vocali e' " + contatore);
     }
}
       